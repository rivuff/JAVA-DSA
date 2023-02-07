package DynamicProgramming;

import java.util.Arrays;

public class longestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "abcjklp";
        String s2 = "dcjkmq";

        System.out.println(solve(s1,s2));
    }

    static int solve(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i],0);
        }

        int ans = 0;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= m; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans, dp[i][j]);
                }
                else {
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }
}
