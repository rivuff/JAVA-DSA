package KumarK.DynamicProgramming;

public class palindromicSubsequence {
    public static void main(String[] args) {

    }

    static int solve(String str){

        int n = str.length();

        char[] arr = str.toCharArray();
        int[][] dp = new int[n+1][n+1];

        for(int i =0;i<n;i++){
            dp[i][i] =1;
        }

        for(int i =0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                dp[i][i+1] = 3;
            }else{
                dp[i][i+1] = 2;
            }
        }

        int len = 3;

        while(len<=n){
             int i=0;
             while (i<n+len-1){
                 int j = i+len-1;

                 if(arr[i]!=arr[j]){
                     dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
                 }else{
                     dp[i][j] = dp[i][j-1]+dp[i+1][j]+1;
                 }
                 i++;
             }
             len++;
        }
        return dp[0][n-1];
    }
}
