package leetcode;

public class baje {
    public static void main(String[] args) {
       int[][] grid = {{1,2,3},{4,5,2},{3,4,1}};
       int n= grid[0].length;
       int m = grid.length;

        System.out.println(solve(n-1,m-1,grid,0));

    }

    static public int solve(int indR, int indC, int[][] grid, int sum){
        if(indR==0 && indC==0){
            return grid[0][0];
        }

        if(indR<0 || indC<0){
            return (int)Math.pow(10,9);
        }

        int sumR = grid[indR][indC] + solve(indR-1, indC, grid, sum);
        int sumC = grid[indR][indC] + solve(indR, indC-1, grid, sum);

        sum = Math.min(sumR, sumC);

        return sum;
    }

    public static class WordBreak {
    }
}
