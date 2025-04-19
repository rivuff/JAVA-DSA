package KumarK.DynamicProgramming;

import java.util.Scanner;

public class MinCostOptPrac {

    static int sum(int i, int j, int[] arr)
    {
        int sum =0;
        while (i<=j){
            sum+=arr[i];
            i++;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int[] arr = new int[n+1];

        for(int i =1;i<=n;i++){
            arr[i] = scr.nextInt();
        }

        int[][] dp = new int[n+1][n+1];

        for(int i =1;i<=n;i++){
            dp[i][i] = arr[i];
        }

        for(int i= 1;i<=n-1;i++){
            dp[i][i+1] = arr[i]+arr[i+1];
        }

        int len = 3;

        while(len<n){
            int i = 0;
            int j = i+len-1;

           while (j<n){
               int k = i;

               int min = Integer.MAX_VALUE;
               while (k<j-1){
                   int possible= dp[i][k] + dp[k+1][j]+ sum(i,j,arr);
                   min = Math.min(min, possible);
               }

               dp[i][j] = min;
               j++;
            }
           len++;
        }
    }

}
