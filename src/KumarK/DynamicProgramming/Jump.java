package KumarK.DynamicProgramming;

import java.util.Scanner;

public class Jump {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int[] arr = new int[n+1];

        for(int i =1;i<=n;i++){
            arr[i] = scr.nextInt();
        }

        int[] dp = new int[1000];

        int i = 3;

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[3]+arr[2];

        while (i<n){
            dp[i] = Math.min(dp[i-2]+arr[i], dp[i-1]+arr[i]+arr[i+1]);
            i++;
        }

        dp[n] = dp[n-2]+arr[n];

        System.out.println(dp[n]);

    }
}
