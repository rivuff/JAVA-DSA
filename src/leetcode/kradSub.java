package leetcode;

import java.util.Arrays;

public class kradSub {
    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        int[] arr = getAverages(nums, k);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i<=2*k;i++){
            sum += nums[i];
        }
        for(int i = 0;i<n;i++){
            if(i<k){
                arr[i] = -1;
            }
            else{
                int div = 2*k+1;
                if(i-k==0){
                    arr[i] = sum/div;
                }
                else{
                    while(i+k<n){
                        int x  = nums[i-k-1];
                        int y = nums[i+k];
                        sum = sum-nums[i-k-1];
                        sum = sum+nums[i+k];

                        arr[i] = sum/div;
                        i++;
                    }

                    while(i+k>=n && i<n){
                        arr[i] = -1;
                        i++;
                    }
                }
            }

        }

        return arr;
    }
}
