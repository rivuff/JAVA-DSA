package KumarK.DynamicProgramming;

import java.util.Arrays;

public class KingsWalk {
    public static void main(String[] args) {

    }


    static int solve(int n, int m){
        int[][] dp = new int[n+1][m+1];

        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){

                dp[i][j] = dp[i-1][j] + dp[i][j-1];

                if(i==1 && j==1){
                    dp[i][j] =1;
                }
            }
        }

        return dp[n][m];
    }
}
