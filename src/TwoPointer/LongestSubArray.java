package TwoPointer;

public class LongestSubArray {
    public static void main(String[] args) {
       int arr[] = {1, 2, 1, 0, 1, 1, 0}, k = 4;
        System.out.println(solve(arr, k));
    }

    static int solve(int[] arr, int target){
        int i =0;
        int j = 0;
        int n = arr.length;
        int sum= 0;
        int count = 0;
        int maxCount = 0;
        while (j<n && i<n){
            if(sum + arr[j]<=target){
                sum+=arr[j];
                count++;
                maxCount = Math.max(count,maxCount);
                j++;
            }else{
                count--;
                sum-=arr[i];
                i++;
            }
        }

        return maxCount;
    }
}
