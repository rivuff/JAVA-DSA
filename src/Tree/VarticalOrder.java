package Tree;

import java.util.*;

public class VarticalOrder {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(5);
        node.left.right = new TreeNode(4);

        System.out.println(verticalTraversal(node));
    }

    static class Touple{
        TreeNode node;
        int level;
        int vart;

        Touple(TreeNode node, int level, int vart){
            this.node = node;
            this.level = level;
            this.vart = vart;
        }

    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Touple> q = new LinkedList<>();

        q.offer(new Touple(root, 0, 0));

        while(!q.isEmpty()){
            Touple t = q.remove();

            int level = t.level;
            int vart = t.vart;
            root = t.node;

            if(!map.containsKey(vart)){
                map.put(vart, new TreeMap<>());
            }
            if(!map.get(vart).containsKey(level)){
                map.get(vart).put(level, new PriorityQueue<Integer>());
            }

            map.get(vart).get(level).add(root.val);

            if(root.left!=null){
                q.offer(new Touple(root.left, vart-1, level+1));
            }
            if(root.right!=null){
                q.offer(new Touple(root.right, vart+1, level+1));
            }

        }

        List<List<Integer>> list = new ArrayList<>();

        for(TreeMap<Integer, PriorityQueue<Integer>> m : map.values()){
            list.add(new ArrayList<>());

            for(PriorityQueue<Integer> pq : m.values()){
                while(!pq.isEmpty()){
                    list.get(list.size()-1).add(pq.poll());
                }
            }

        }

        return list;
    }
}

