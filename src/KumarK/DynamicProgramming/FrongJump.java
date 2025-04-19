package KumarK.DynamicProgramming;

import java.util.Scanner;

public class FrongJump {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int t =scr.nextInt();

        while(t-->0){
            int n = scr.nextInt();

            int[] arr = new int[n+1];

            for(int i =1;i<=n;i++){
                arr[i] = scr.nextInt();
            }
            int k = scr.nextInt();
            int[] dp = new int[n+1];

            dp[0] = 0;
            dp[1] = arr[1]-arr[0];
            for(int i = 1;i <n;i++){
                int j= 1;
                int min = Integer.MAX_VALUE;
                while(j<=k){
                    if(i-j>=0){
                        min = Math.min(min, (arr[i]-arr[i-j])+dp[i]);
                    }
                    j++;
                }

                arr[i] = min;
            }

            System.out.println(arr[n]);
        }
    }

}
