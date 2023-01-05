package DynamicProgramming;

public class jumpGame {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        int n = arr.length;
        Boolean[] dp = new Boolean[n];
        System.out.println(solve(0,n-1,arr,dp));
    }

    static boolean solve(int ind, int n, int[] nums, Boolean[] dp){
        if(ind==n-1){
            return true;
        }

        if(dp[ind] != null) return dp[ind];


        for(int j=ind+1;j<=Math.min(n,ind+nums[ind]+1);j++){
           if(solve(ind+j,n,nums,dp)){
               dp[ind]=true;
               return true;

           }
        }
        dp[ind] =false;
        return false;
    }
}
