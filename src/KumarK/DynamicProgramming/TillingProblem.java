package KumarK.DynamicProgramming;

import java.util.Scanner;

public class TillingProblem {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int[] dp = new int[n + 1];

        dp[1]=1;
        dp[2] = 2;
        dp[3] = 3;
        int i =4;
        while (i<=n){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }

}
