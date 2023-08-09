package KumarK.DynamicProgramming;

public class lengthLongPalindrome {
    public static void main(String[] args) {

    }

    static int solve(String s){
        int n = s.length();

        char[] arr = s.toCharArray();

        int l_length = 0;
        int[][] dp = new int[n+1][n+1];


        for(int i = 0;i<n;i++){
            dp[i][i] = 1;
            l_length = 1;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                dp[i][i+1] = 1;
                l_length = 2;
            }
        }

        int len = 3;

        while(len<=3){
            int i = 0;

            while(i<n-len +1){
                int j = i+len- 1;

                if(arr[i] == arr[j] && dp[i+1][j-1] == 1){
                    dp[i][j] = 1;
                    l_length = len;
                }
                i++;
            }
            len++;
        }
        return l_length;
    }
}
