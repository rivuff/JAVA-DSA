package DynamicProgramming;

import java.util.Arrays;

public class houseRobberII {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        int first =solve1(nums, n-2, dp);
        int second = solve2(nums,n-1,dp);

        return Math.max(first,second);
    }
    public static int solve2(int[] nums, int ind, int[] dp){
        if(ind ==1) return nums[1];
        if(ind<1) return 0;

        if(dp[ind]!=-1) return dp[ind];

        int pick = nums[ind] + solve2(nums, ind-2,dp);
        int notPick = solve2(nums, ind-1, dp);

        dp[ind] = Math.max(pick,notPick);

        return dp[ind];
    }

    public static int solve1(int[] nums, int ind, int[] dp){
        if(ind ==0) return nums[0];
        if(ind<0) return 0;

        if(dp[ind]!=-1) return dp[ind];

        int pick = nums[ind] + solve1(nums, ind-2,dp);
        int notPick = solve1(nums, ind-1, dp);

        dp[ind] = Math.max(pick,notPick);

        return dp[ind];
    }
}
