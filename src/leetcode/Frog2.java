package leetcode;

public class Frog2 {
    public static void main(String[] args) {
        int[] arr=  {10,30,40,50,20};
        System.out.println(solve(arr, 3));
    }

    static int solve(int[] arr, int k){
        int n = arr.length;

        int[] dp = new int[n];

        dp[0] = 0;
        dp[1] = arr[1] - arr[0];

        for(int i = 2;i<n;i++){
            int min = Integer.MAX_VALUE;
            int j = 1;
            while (j<=k){
                if(i-j>=0){
                    min = Math.min(min, Math.abs(arr[i] - arr[i-j])+dp[i-j]);
                }
                j++;
            }
            dp[i] = min;
        }

        return dp[n-1];
    }
}
