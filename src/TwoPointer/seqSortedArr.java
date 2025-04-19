package TwoPointer;

import java.util.Arrays;

public class seqSortedArr {
    public static void main(String[] args) {
        int[] arr = {-5,-3,-2,-1};
        int[] num = sortedSquares(arr);
        System.out.println(Arrays.toString(num));
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j =-1;
        int[] arr = new int[n];
        while(i<n){
            if(nums[i]>=0){
                j = i;
                break;
            }
            i++;
        }

        i--;

        if(j==0){
            while(j<n){
                arr[j] =(int)Math.pow(nums[j], 2);
                j++;
            }
        }else if(i==n-1){
            int k = 0;
            while(i>=0){
                arr[k] =(int)Math.pow(nums[i], 2);
                i--;
                k++;
            }
        }else{
            int k = 0;
            while(i>=0 && j<n){
                if(Math.abs(nums[i]) < nums[j]){
                    arr[k]  = (int)Math.pow(nums[i], 2);
                    i--;
                    k++;
                }else{
                    arr[k] = (int)Math.pow(nums[j], 2);
                    j++;
                    k++;
                }
            }

            while(i>=0){
                arr[k]  = (int)Math.pow(nums[i], 2);
                i--;
                k++;
            }

            while(j<n){
                arr[k] =(int) Math.pow(nums[j], 2);
                j++;
                k++;
            }
        }

        return arr;
    }
}
