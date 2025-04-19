package KumarK.DynamicProgramming;

public class MinPathSum {
    public static void main(String[] args) {

        int[][] grid = {{1,2,3},{4,5,6}};
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i-1>=0 && j-1>=0){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
                }
                else if(i-1>=0){
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }else if(j-1>=0){
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                }

                if(i==0 && j==0){
                    dp[i][j] = grid[i][j];
                }
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}
