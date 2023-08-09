package KumarK.DynamicProgramming;

import java.util.Arrays;

public class palindomicSubstring {
    public static void main(String[] args) {

    }

    static int solve(String s ){
        int n = s.length();

        char[] arr = s.toCharArray();

        int countPalindrome = 0;
        int[][] dp = new int[n+1][n+1];


        for(int i = 0;i<n;i++){
            dp[i][i] = 1;
            countPalindrome++;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                dp[i][i+1] = 1;
                countPalindrome++;
            }
        }

        int len = 3;

        while(len<=3){
            int i = 0;

            while(i<n-len +1){
                int j = i+len- 1;

                if(arr[i] == arr[j] && dp[i+1][j-1] == 1){
                    dp[i][j] = 1;
                    countPalindrome++;
                }
                i++;
            }
            len++;
        }
        return countPalindrome;
    }
}
