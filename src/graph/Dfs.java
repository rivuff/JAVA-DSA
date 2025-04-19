package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dfs {

    static void dfs(int node, List<Integer>[] arr, int[] used, int[] parent){
        System.out.println(node);
        used[node] = 1;

        for(int u : arr[node]){
            if(used[u] ==0){
                parent[u]=node;
                dfs(u,arr,used,parent);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int m = scr.nextInt();

        List<Integer>[] arr = new List[n+5];

        for(int i = 0;i<n+5;i++){
            arr[i] = new ArrayList<>();
        }

        for(int i = 0;i<m;i++){
            int u = scr.nextInt();
            int v = scr.nextInt();

            arr[u].add(v);
            arr[v].add(u);
        }

        int[] used = new int[n+5];
        int[] parent = new int[n+5];

        dfs(1, arr, used, parent);

    }
}
