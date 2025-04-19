package KumarK.DynamicProgramming;

import java.util.Scanner;

public class SubsetSumK {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int k = scr.nextInt();

        int[] arr = new int[n+1];

        for(int i =1;i<=n;i++){
            arr[i] = scr.nextInt();
        }

        int[][] dp = new int[n+1][k+1];
        dp[0][0] = 1;

        int i =1;

        while (i<=n){
            int j = 0;

            while (j<=k){
                if(arr[i]<=j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
                j++;
            }
            i++;
        }

        System.out.println(dp[n][k]);
    }
}
