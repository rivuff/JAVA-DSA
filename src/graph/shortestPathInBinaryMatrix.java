package graph;

import javax.swing.plaf.IconUIResource;
import java.util.LinkedList;
import java.util.Queue;

public class shortestPathInBinaryMatrix {

    class pair{
        private int first;
        private int second;
        public pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {


    }

    public int  shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length-1;

        if (grid[0][0]==1 || grid[n][n]==1){
            return -1;
        }

        Queue<pair> q = new LinkedList<>();
        int level =0;

        q.add(new pair(0,0));

        while (!q.isEmpty()){
            int size = q.size();
            while (size-->0){
                pair head = q.poll();
                int x = head.first;
                int y = head.second;

                if (x==n && y==n){
                    return level+1;
                }

                if (x<0 || y<0 || x>n || y>n || grid[x][y]==1){
                    continue;
                }


                q.offer(new pair(x-1,y));
                q.offer(new pair(x+1,y));
                q.offer(new pair(x,y-1));
                q.offer(new pair(x,y+1));

                q.offer(new pair(x-1,y+1));
                q.offer(new pair(x-1,y-1));
                q.offer(new pair(x+1,y-1));
                q.offer(new pair(x+1,y+1));
            }
            level++;
        }

        return -1;
    }

}
