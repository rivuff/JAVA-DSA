package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2}};

        System.out.println(orangesRotting(arr));
    }

    static class Pair{
        int first;
        int second;

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int fresh=0;

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] ==2){
                    q.add(new Pair(i,j));
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0){
            return 0;
        }

        int[] ax = {1,0,-1,0};
        int [] ay = {0,1,0,-1};
        int time = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int temp = 0;
            while(size!=0){
                Pair p =q.poll();
                int x1 = p.first;
                int y1 = p.second;
                for(int i =0;i<4;i++){
                    int row = ax[i] + x1;
                    int col = ay[i] + y1;

                    if(row>=0 && row<n && col>=0 && col<m){
                        if(grid[row][col]==1){
                            q.add(new Pair(row, col));
                            grid[row][col]=2;
                            temp++;
                        }
                    }
                }

                size--;
            }

            if(temp!=0){
                time++;
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }

        return time;

    }
}
