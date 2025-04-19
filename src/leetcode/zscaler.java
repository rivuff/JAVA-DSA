package leetcode;

public class zscaler {
    public static void main(String[] args) {
        int[] arr = {-3,4,3,-2,2,5};
        System.out.println(solve(arr, 4));
    }

    static int solve(int[] arr, int k){
        int i = 0;
        int sum = 0;
        int maxSum = 0;
        int j = 0;
        int n = arr.length;
        while(i<k){
            sum+=arr[i];
            i++;
        }

        maxSum  =sum;
        while (i<n){
            sum -=arr[j];
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            i++;
            j++;
        }

        return maxSum;

    }
}
