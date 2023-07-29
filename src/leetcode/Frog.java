package leetcode;

public class Frog {
    public static void main(String[] args) {
        int[] nums = {10,30,40,20};
        System.out.println(solve(nums));
    }

    public static int solve(int[] nums){
        int n = nums.length;
        int i = 0;
        int[] dp = new int[nums.length+1];

        dp[0] = 0;
        dp[1] = Math.abs(nums[1] - nums[0]);
        i =2;
        while (i<n){
            dp[i] = Math.min(Math.abs(nums[i] - nums[i-1]) + dp[i-1], Math.abs(nums[i]-nums[i-2])+dp[i-2]);
            i++;
        }

        return dp[n-1];
    }
}
