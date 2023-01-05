package DynamicProgramming;

import java.util.Arrays;

public class cVacation {


    public static void main(String[] args) {
        int n = 3;
        int[][] arr = {
                {10,40,70},
                {20,50,80},
                {30,60,90}
        };

        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],-1);
        }

        System.out.println(solve(n-1,n,arr,dp));
    }

    static int solve(int day, int last, int[][] arr, int[][] dp){

        if(day==0){
            int maxi=0;

            for (int i = 0; i < 3; i++) {
                if (i!=last){
                    maxi=Math.max(maxi,arr[0][i]);
                }
            }
            return maxi;
        }

        int maxi = 0;
        if (dp[day][last]!=-1) return dp[day][last];

        for (int i = 0; i < 3; i++) {
            if (i!=last){
                int p = arr[day][i] + solve(day-1,i,arr,dp);
                maxi=Math.max(p,maxi);
            }
        }
        return dp[day][last] = maxi;
    }
}
