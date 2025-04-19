package KumarK.DynamicProgramming;

import java.util.Scanner;

public class maxCostWork {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int[] easy = new int[n+1];
        int[] hard = new int[n+1];
        int i =1;
        while (i<=n){
            easy[i] = scr.nextInt();
            hard[i] = scr.nextInt();
            i++;
        }

        int[][] dp = new int[n+1][5];

        dp[1][1] = easy[1];
        dp[1][2] = hard[1];
        dp[1][3] = 0;

        i= 2;
        while (i<=n){
            dp[i][1] = easy[i] + Math.max(dp[i-1][1], Math.max(dp[i-1][2], dp[i-1][3]));
            dp[i][2] = hard[i] + dp[i-1][3];
            dp[i][3] = Math.max(dp[i-1][1], Math.max(dp[i-1][2], dp[i-1][3]));
            i++;
        }

        System.out.println(Math.max(dp[n][1], Math.max(dp[n][2],dp[n][3])));
    }
}
