package KumarK.DynamicProgramming;

import java.util.Scanner;

public class HappyShopping {
    public static void main(String[] args) {
        /*
            Given

            cost[] = []
            happiness[] = []
            min[] =[]
            max = []
            money =
         */

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int[] cost = new int[n+1];
        int[] happiness = new int[n+1];
        int[] min = new int[n+1];
        int[] max = new int[n+1];

        for(int i =1;i<=n;i++){
            cost[i] =scr.nextInt();
        }
        for(int i =1;i<=n;i++){
            happiness[i] =scr.nextInt();
        }
        for(int i =1;i<=n;i++){
            min[i] =scr.nextInt();
        }
        for(int i =1;i<=n;i++){
            max[i] =scr.nextInt();
        }

        int money = scr.nextInt();

        int[][] dp = new int[n+1][n+1];

        int i = 0;
        int total = Integer.MIN_VALUE;
        dp[0][0] = 0;
        while(i<=n){

            

        }


    }
}
