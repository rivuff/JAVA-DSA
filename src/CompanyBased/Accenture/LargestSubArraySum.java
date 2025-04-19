package CompanyBased.Accenture;

public class LargestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3,};

        int n = arr.length;

        int[] dp = new int[n];
        dp[0] = arr[0];
        int ans = 0;

        for(int i =1;i<n;i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            ans = Math.max(ans, dp[i]);
        }

        System.out.println(ans);


    }
}
