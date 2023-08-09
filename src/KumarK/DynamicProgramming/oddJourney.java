package KumarK.DynamicProgramming;

public class oddJourney {
    public static void main(String[] args) {
        int[] arr = {5,4,2,6};
        System.out.println(solve(arr));
    }

    static int solve(int[] arr){
        int n = arr.length;

        int[][] dp = new int[n][2];
        if(arr[0]%2==0){
            dp[1][0] = 1;
            dp[1][1] = 0;
        }

        else if(arr[0]%2==1){
            dp[1][0] = 0;
            dp[1][1] = 1;

        }

        for(int i = 2;i<n;i++){
            if(arr[i]%2 ==0){
                dp[i][1] = dp[i-1][1] + dp[i-2][1];
                dp[i][0] = dp[i-1][0] + dp[i-2][0];
            }else{
                dp[i][1] = dp[i-1][0] + dp[i-2][0];
                dp[i][0] = dp[i-1][1] + dp[i-2][1];
            }
        }

        return dp[n-1][1];

    }
}
