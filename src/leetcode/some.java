package leetcode;

import java.awt.*;
import java.util.Arrays;

public class some {
    public static void main(String[] args) {
        int[] nums = {1,3,3,2,7,3};
        int k = 2;

        int[][] arr = divideArray(nums,k);

        for(int[] num: arr){
            System.out.println(Arrays.toString(num));
        }
        
    }

    public static int[][] divideArray(int[] nums, int k) {
        int n = nums.length;

        int[][] emp = {{}};
        if(n%3!=0) return emp;

        int l = n/3;

        int[][] arr = new int[l][3];
        Arrays.sort(nums);

        int row = 0;

        arr[row][0] = nums[0];


        int end = 2;
        int start = 0;
        while(end<n){
            //count++;

            int lastCol = end%3;
            int firstCol = start%3;
           arr[row][firstCol] = nums[start];
            if(nums[end] - nums[start]<=k){
                arr[row][lastCol] = nums[end];
                arr[row][lastCol-1] = nums[end-1];
            }else {
                return emp;
            }
            end+=3;
            start+=3;
            row++;

            // count+=3;
        }

        return arr;


    }
}
