package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class maxNumberOfEvents {
    public static void main(String[] args) {
        int[][] events= {{1,2,4}, {3,4,3},{2,3,10}};
        int k= 1;
        int n = events.length;

        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        int[][] dp = new int[n][k+1];

        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }


        System.out.println(solve(0, 0,events, k, dp, n));
    }

    static int solve(int ind, int prevEnd, int[][] events, int k, int[][] dp, int n){

        if(ind==n || k<0){
            return 0;
        }

        if(dp[ind][k]!=-1){
            return dp[ind][k];
        }

        int take = 0;

        if(events[ind][0]>prevEnd){
           take = events[ind][2] + solve(ind+1,  events[ind][1], events, k-1, dp, n);
        }

        int notTake = solve(ind+1, prevEnd, events, k, dp, n);

        return dp[ind][k] = Math.max(take, notTake);

    }
}
