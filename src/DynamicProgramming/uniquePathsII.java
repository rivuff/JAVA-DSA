package DynamicProgramming;

import java.util.Arrays;

public class uniquePathsII {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1},
                {0,0}
        };
        System.out.println(uniquePathsWithObstacles(arr));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[][] dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(obstacleGrid, n-1, m-1, dp);
    }

    public static int solve(int [][] obstacleGrid, int n , int m , int[][] dp){

        if(n>0 && m>0 && obstacleGrid[n][m]==1){
            return 0;
        }
        if(n==0 && m == 0){
            return 1;
        }

        if(n<0 || m<0){
            return 0;
        }


        if(dp[n][m]!=-1) return dp[n][m];

        int up = solve(obstacleGrid, n-1,m,dp);
        int left = solve(obstacleGrid, n,m-1,dp);

        return dp[n][m]= up+left;
    }
}
