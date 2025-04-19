package KumarK.DynamicProgramming;

import java.util.Scanner;

public class FrogJump1 {
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        int t = scr.nextInt();

        while (t-->0){
            int n = scr.nextInt();

            int[] arr = new int[n+1];

            for(int i =1;i<n;i++){
                arr[i] = scr.nextInt();
            }

            int[] dp = new int[n+1];

            dp[1] = 0;
            dp[2] = dp[1] + Math.abs(arr[0] - arr[1]);

            int i =3;

            while (i<=n){
                dp[i] = Math.min(dp[i-1] + Math.abs(arr[i]-arr[i-1]), dp[i-2] + Math.abs(arr[i]-arr[i-2]));
                i++;
            }

            System.out.println(dp[n]);
        }
    }

}
