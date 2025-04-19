package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Floodfill {
    public static void main(String[] args) {
        int[][] screen ={
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1}};

        int n = screen.length;
        int m = screen[0].length;

        int x = 4, y =4;

        solve(screen, n, m, x,y,screen[x][y],3);

        for(int[] arr : screen){
            System.out.println(Arrays.toString(arr));
        }
    }


    static class Pair{
        int x, y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static boolean isValid(int[][] screen, int n, int m, int x, int y, int prevC, int newC){
        if(x>=0 && x<n && y>=0 && y<m && screen[x][y] == prevC){
            screen[x][y] = newC;
            return true;
        }

        return false;
    }

    public static void solve(int[][] screen, int n, int m, int x, int y, int prevC, int newC){
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(x, y));

        while (!q.isEmpty()){

            Pair p = q.poll();
            int posX = p.x;
            int posY = p.y;
            if(isValid(screen, n, m, posX+1, posY, prevC, newC)){
                q.add(new Pair(posX+1,posY));
            }

            if(isValid(screen, n,m,posX,posY+1, prevC, newC)){
                q.add(new Pair(posX,posY+1));
            }

            if(isValid(screen, n,m,posX-1, posY, prevC,newC)){
                q.add(new Pair(posX-1,posY));
            }

            if(isValid(screen,n,m,posX,posY-1,prevC, newC)){
                q.add(new Pair(posX, posY-1));
            }

        }

    }


}
