package KumarK.DynamicProgramming;

// [5,8,2,10]

public class MinCostOpt {
    public static void main(String[] args) {
        int[] arr = {5,8,2,10};
        System.out.println(solve(arr));
    }

    static int sum(int i, int j, int[] arr){
        int sum =0;
        while (i<=j){
            sum+=arr[i];
            i++;
        }
        return sum;
    }

    static int solve(int[] arr){
        int n = arr.length;

        int[][] dp = new int[n+1][n+1];

        // for dp[i][i] when starting and ending index is same no sum would be there.
        for(int i =0;i<n;i++){
            dp[i][i] = arr[i];
        }

        for(int i =0;i<n-1;i++){
            dp[i][i+1] = arr[i]+arr[i+1];
        }

        int len = 3;

        while (len<=n){
            int i =0;
            int j = i+len-1;

            while (j<n){

                int k = i;
                int min = Integer.MAX_VALUE;
                while (k<j-1){
                    int possible = dp[i][k] + dp[k+1][j] + sum(i, j, arr);
                    min = Math.min(min, possible);
                    k++;
                }

                dp[i][j] = min;
                i++; j++;
            }
          len++;
        }

        return dp[0][n-1];

    }
}
