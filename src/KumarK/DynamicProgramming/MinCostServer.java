package KumarK.DynamicProgramming;

import java.util.Scanner;

public class MinCostServer {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

//        int n = scr.nextInt();
//
//        int[] mic = new int[n+1];
//        int[] mon = new int[n+1];
//
//        for(int i = 1;i<=n;i++){
//            mic[i] = scr.nextInt();
//        }
//
//        for(int i =1;i<=n;i++){
//            mon[i] = scr.nextInt();
//        }
        int n = 5;
        int[] mic = {0,3,5,2,1,3};
        int[] mon = {0,1,1,10,5,3};

        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = mic[1];

        for(int i= 2;i<=n;i++){
            int valA = dp[i-1]+mic[i];
            int min = Integer.MAX_VALUE;
            int j = i-1;
            int sum = mon[i]+mon[i-1];

            while (j>=1){
                int valB=dp[j-1] + sum;

                min = Math.min(valA, valB);
                j--;
                sum+=mon[j];



            }

            dp[i]  = min;

        }

        System.out.println(dp[n]);
    }



}
