package DynamicProgramming;

import java.util.Arrays;

public class frogJump {
    public static void main(String[] args) {
        int n = 4;
        int[] height = {10,20,30,10,20};
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(solveMemo(n-1, height,dp));
    }

    //Memoization
    public static int solveMemo(int n, int height[], int[] dp){
        if (n==0){
            return 0;
        }
        if (dp[n]!=-1) return dp[n];
        int right = solve(n-1, height) + Math.abs(height[n] - height[n-1]);
        int left = Integer.MAX_VALUE;
        if (n>1){
            left = solve(n-2, height) + Math.abs(height[n]-height[n-2]);
        }

        return dp[n] = Math.min(left,right);

    }

    //  Recursion
    public static int solve(int n, int height[]){
        if(n==0){
            return 0;
        }

        int right = solve(n-1, height) + Math.abs(height[n] - height[n-1]);
        int left = Integer.MAX_VALUE;
        if (n>1){
            left = solve(n-2, height) + Math.abs(height[n]-height[n-2]);
        }


        return Math.min(right, left);
    }
}
