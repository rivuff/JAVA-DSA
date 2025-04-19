package CompanyBased.Accenture;

import java.util.Arrays;

public class LongestIncreasingSubSeq {
    public static void main(String[] args) {

        int[] arr = {4,10,4,3,8,9};
        int n = arr.length;

        int[][] dp = new int[n][n+1];

        for(int[] num : dp){
            Arrays.fill(num,-1);
        }


        System.out.println(solve(0, arr, n,-1, dp));
    }

    static int solve(int ind, int[] arr, int n, int prev_ind, int[][] dp){
        if(ind == n){
            return 0;
        }

        if(dp[ind][prev_ind+1]!=-1){
            return dp[ind][prev_ind+1];
        }

        int notTake = solve(ind+1, arr, n,prev_ind, dp);
        int take =0;
        if(prev_ind == -1 || arr[ind]>arr[prev_ind]){
            take =1+ solve(ind +1, arr, n,ind, dp);
        }

        return dp[ind][prev_ind+1] = Math.max(take, notTake);
    }
}
