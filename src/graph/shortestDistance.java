package graph;

import java.util.*;

public class shortestDistance {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int m = scr.nextInt();

        List<Integer>[] arr = new List[n+5];

        for(int i = 0;i<arr.length;i++){
            arr[i] = new ArrayList<Integer>();
        }

        for(int i =0;i<m;i++){
            int u = scr.nextInt();
            int v  = scr.nextInt();

            arr[u].add(v);
            arr[v].add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        int source = scr.nextInt();

        q.add(source);

        int[] used = new int[n+5];
        used[source] = 1;

        int[] level = new int[n+5];


        while (!q.isEmpty()){

            int v = q.poll();

            for(int u : arr[v]){
                if(used[u]==0){
                    q.add(u);

                    used[u] = 1;

                    level[u] = level[v]+1;
                }
            }

        }

        for(int i =1;i<=n;i++){
            System.out.print(level[i] + " ");
        }


    }
}
