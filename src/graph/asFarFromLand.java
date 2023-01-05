package graph;

import java.util.LinkedList;
import java.util.Queue;

public class asFarFromLand {
    public static void main(String[] args) {

    }

    public int maxDist(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int[][] dist = new int[n][m];
        Queue<node> q=new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]==1){
                    vis[i][j]=1;
                    q.add(new node(i,j,0));
                }
                else {
                    vis[i][j]=0;
                }
            }
        }

        int[] delrow = {1,0,-1,0};
        int[] delcol = {0,1,0,-1};

        while (!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int step = q.peek().third;

            q.remove();

            dist[row][col]=step;

            for (int i = 0; i <4 ; i++) {
                int nrow = row+delrow[i];
                int ncol = row+delcol[i];

                if (nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
                    q.add(new node(nrow,ncol,step+1));
                    vis[nrow][ncol]=1;
                }
            }
        }
        int max =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(dist[i][j]>max){
                    max=dist[i][j];
                }
            }
        }

        return max;
    }

    class node{
        private int first;
        private int second;
        private int third;
        public node(int first,int second,int third){
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
}
