package graph;

import java.util.*;

public class NumOfShortestPath {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int m = scr.nextInt();

        List<Integer>[] arr = new List[m];

        for(int i = 0;i<m;i++){
            arr[i] = new ArrayList<>();
        }

        for(int i =0;i<m;i++){
            int u = scr.nextInt();
            int v = scr.nextInt();

            arr[u].add(v);
            arr[v].add(u);
        }

        Queue<Integer> q = new LinkedList<>();

        q.add(1);

        int[] used = new int[n+5];
        used[1] = 1;

        int[] level = new int[n+5];
        level[1] = 0;
        int[] ways = new int[n+5];
        ways[1] = 1;
        while(!q.isEmpty()){
            int v = q.poll();

            for(int u : arr[v]){
                if(used[u]==0){
                    q.add(u);
                    used[u] = 1;
                    ways[u] = ways[v];
                    level[u] = level[v]+1;
                }else{
                    if(level[v]+1 == level[u]){
                        ways[u] +=ways[v];
                    }
                }
            }
        }

        for(int i =1;i<=n;i++){
            System.out.print(ways[i] + " ");
        }
    }
}
