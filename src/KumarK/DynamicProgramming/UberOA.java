package KumarK.DynamicProgramming;

import java.util.Scanner;

public class UberOA {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int[] a = new int[n+1];
        int[] b = new int[n+1];

        for(int i = 1;i<=n;i++){
            a[i] = scr.nextInt();
        }

        for(int i =1;i<=n;i++){
            b[i] = scr.nextInt();
        }

        int[][][] dp = new int[n+1][5][5];

        dp[1][1][1] = a[1];
        dp[1][1][2] = a[1];
        dp[1][2][1] = b[1];
        dp[1][2][2] = b[1];

        int i = 2;

        while(i<=n){
            dp[i][1][1] = a[i] +a[i-1] + Math.max(dp[i-2][2][1], dp[i-2][2][2]);
            dp[i][2][2] = b[i] + b[i-1] + Math.max(dp[i-2][1][2], dp[i-2][1][1]);
            dp[i][1][2] = a[i] + b[i-1] + Math.max(dp[i-2][1][1], Math.max(dp[i-2][1][2], dp[i-2][2][1]));
            dp[i][2][1] = b[i]+a[i-1] + Math.max(dp[i-2][2][2], Math.max(dp[i-2][1][2], dp[i-2][2][1]));
        }

        System.out.println(Math.max(dp[n][1][1], Math.max(dp[n][2][2], Math.max(dp[n][1][2], dp[n][2][1]))));


    }
}
