package DynamicProgramming;

import java.util.Arrays;
import java.util.Enumeration;

public class targetSum {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1};
        int target=3;

        int n = arr.length;
        System.out.println("The number of ways found is "+findTargetSumWays(arr,target));
    }

    public static int findTargetSumWays(int[] nums, int s) {
        int sum = 0;
        for(int i: nums) sum+=i;
        int n =nums.length;

        if(sum-s < 0) return 0;
        if((sum-s)%2==1){
            return 0;
        }

        int s2 = (sum-s)/2;
        int[][] dp = new int[n][s2+1];
        for (int[] arr: dp){
            Arrays.fill(arr,-1);
        }

        return countPartitionsUtil(n-1,s2,nums,dp);
    }
    static int countPartitionsUtil(int ind, int target, int[] arr,int[][] dp){

        if(ind == 0){
            if(target==0 && arr[0]==0)
                return 2;
            if(target==0 || target == arr[0])
                return 1;
            return 0;
        }

        if(dp[ind][target]!=-1)
            return dp[ind][target];

        int notTaken = countPartitionsUtil(ind-1,target,arr,dp);

        int taken = 0;
        if(arr[ind]<=target)
            taken = countPartitionsUtil(ind-1,target-arr[ind],arr,dp);

        return dp[ind][target]= (notTaken + taken);
    }

}
