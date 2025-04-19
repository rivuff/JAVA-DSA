package KumarK.DynamicProgramming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReCostructingArray {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);


        //String str = scr.next();

       //int k =  scr.nextInt();

        String str = "1234";
        int k =100;
        int n = str.length();
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i =1;i<=n;i++){
            arr[i] = str.charAt(i-1)-'0';
        }

        int[] dp = new int[n+1];

        int i = 1;
        dp[0] =1;

        while (i<=n){
            int j = i-1;

            while (j >= 0 && j>=i-10){

                //int l = Math.abs(j-i);

                String s = str.substring(j,i);
                int val = Integer.parseInt(s);

                if(val<=k && arr[j+1]!=0){
                    dp[i]+=dp[j];
                }

                j--;

            }
            i++;
        }

        System.out.println(dp[n]);
    }
}
