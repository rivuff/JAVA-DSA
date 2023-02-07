package DynamicProgramming;

import java.util.Arrays;

public class shortestSupersequence {
    public static void main(String[] args) {

    }

    static String solve(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];

        for(int[] arr : dp){
            Arrays.fill(arr,0);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }
                else dp[i][j] = 0 + Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        int len = dp[n][m];
        int i = n;
        int j = m;

        int index = len-1;
        String ans = "";

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                ans += s1.charAt(i-1);
                index--;
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                ans += s1.charAt(i-1);
                i--;
            } else {
                ans += s2.charAt(j-1);
                j--;
            }
        }

        //Adding Remaing Characters - Only one of the below two while loops will run

        while(i>0){
            ans += s1.charAt(i-1);
            i--;
        }
        while(j>0){
            ans += s2.charAt(j-1);
            j--;
        }

        String ans2=new StringBuilder(ans).reverse().toString();

        return ans2;
    }
}
