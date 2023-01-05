package DynamicProgramming;


import java.util.Arrays;

public class rodCutting {
    public static void main(String[] args) {
        int[] price = {2,5,7,8,10};
        int n = price.length;
        int[][] dp = new int[n][n+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }

        System.out.println(cutRodUtil(price,n-1, n, dp));
    }

    static int cutRodUtil(int[] price, int ind, int N,int[][] dp){

        if(ind == 0){
            return N*price[0];
        }

        if(dp[ind][N]!=-1)
            return dp[ind][N];

        int notTaken = 0 + cutRodUtil(price,ind-1,N,dp);

        int taken = Integer.MIN_VALUE;
        int rodLength = ind+1;
        if(rodLength <= N)
            taken = price[ind] + cutRodUtil(price,ind,N-rodLength,dp);

        return dp[ind][N] = Math.max(notTaken,taken);
    }

}
