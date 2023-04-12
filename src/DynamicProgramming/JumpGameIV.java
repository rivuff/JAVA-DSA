package DynamicProgramming;

import java.util.*;

public class JumpGameIV {
    public static void main(String[] args) {

    }

    public static int minJumps(int[] arr) {
        int n = arr.length;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i =0;i<n;i++){
            ArrayList<Integer> indices = map.getOrDefault(arr[i], new ArrayList<>());
            indices.add(i);
            map.put(arr[i], indices);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(0);
        int level = 0;

        while (!q.isEmpty()){
            int size = q.size();
            while (size-->0){
                Integer head = q.poll();

                if(head==n-1){
                    return level;
                }

                if(head<0 || head>=n || visited[head]){
                    continue;
                }

                if(head-1>0 && !visited[head-1]){
                    q.offer(head-1);
                }

                if(head+1<n && !visited[head+1]){
                    q.offer(head+1);
                }

                if(map.containsKey(arr[head])){
                    for(int index : map.get(arr[head])){
                        if(index>=0 && index<n && !visited[index]) {
                            q.offer(index);
                        }
                    }
                    map.remove(arr[head]);
                }
            }
            level++;
        }
        return -1;
    }

}
