package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class minCostForTicket {
    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};

        int n = days.length;
        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);
        System.out.println(solve(n,days,costs,0, dp));

    }

    public static int solve(int n, int[] days, int[] costs, int ind, int[] dp){
        if(ind>=n){
            return 0;
        }
        

        if(dp[ind]!=-1) return dp[ind];

        int one = costs[0] + solve(n,days,costs,ind+1,dp);

        int i =0;

        for(i = ind; i<n && days[i]<days[ind]+7;i++);

        int seven = costs[1] + solve(n,days,costs, i,dp);

        for(i = ind; i<n && days[i]<days[ind]+30;i++);

        int thirty = costs[2] + solve(n,days,costs, i,dp);

        return dp[ind] =  Math.min(thirty, Math.min(one,seven));

    }
}
