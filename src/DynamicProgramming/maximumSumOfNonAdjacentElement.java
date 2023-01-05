package DynamicProgramming;

import java.util.Arrays;

public class maximumSumOfNonAdjacentElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,5,2,5,1,6,7,3,2,34,1,6};
        int n = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(solveMemo(arr,n-1,dp));
    }

    static int solveMemo(int[] arr, int ind, int[] dp){

        if (ind==0){
            return dp[0]=arr[0];
        }
        if (ind<0){
            return 0;
        }
        if (dp[ind]!=-1){
            return dp[ind];
        }

        int pick= arr[ind]+solveMemo(arr,ind-2,dp);
        int notPic = solveMemo(arr,ind-1,dp);

        return dp[ind] = Math.max(pick,notPic);
    }

    static int solve(int[] arr, int ind){
        if(ind==0){
            return arr[0];
        }
        if (ind<0){
            return 0;
        }

        int pick = arr[ind]+solve(arr,ind-2);
        int notPick = solve(arr,ind-1);

        return Math.max(pick,notPick);
    }


}
