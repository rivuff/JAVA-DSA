package DynamicProgramming;

import java.util.Arrays;

public class longestCommonPalindromicSubstring {
    public static void main(String[] args) {

    }

    static int longestCommonPalindromicSubseq(String s){
        String t = s;
        String str = new StringBuilder(s).reverse().toString();

        return longestCommonSubseq(t,str);
    }

    static int longestCommonSubseq(String s1, String s2){
        int n = s1.length();
        int m  = s2.length();

        int[][] dp = new int[n+1][m+1];

        for(int[] arr : dp){
            Arrays.fill(arr,0);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                     dp[i][j]= 1+ dp[i-1][j-1];
                }
                else dp[i][j] = 0 + Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[n][m];
    }
}
