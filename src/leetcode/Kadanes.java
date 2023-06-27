package leetcode;

public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        System.out.println(maxSubarraySum(arr, 4));
    }

    public static long maxSubarraySum(int arr[], int n){

        // Your code here
        long sum = 0;
        long maxSum =Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(sum<0){
                sum = 0;
            }
            sum +=arr[i];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;

    }
}
