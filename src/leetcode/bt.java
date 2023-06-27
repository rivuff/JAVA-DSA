package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class bt {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    class Solution {
        public int getMinimumDifference(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            dfs(root, list);
            Arrays.sort(list.toArray());
            int min = Integer.MIN_VALUE;
            for(int i =0;i<list.size()-1;i++){
                min= Math.min(list.get(i)-list.get(i+1), min);
            }

            return min;
        }

        public void dfs(TreeNode root, List<Integer> list){
            while(root.left!=null && root.right!=null){
                list.add(root.val);
                dfs(root.left, list);
                dfs(root.right, list);
            }

            while(root.left!=null){
                list.add(root.left.val);
                root = root.left;
            }

            while(root.right!=null){
                list.add(root.right.val);
                root = root.right;
            }
        }
    }
}
