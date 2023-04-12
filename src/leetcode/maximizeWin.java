package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class maximizeWin {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }

        int k =scr.nextInt();

        int[] nums = twoSum(arr, k);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i =0;
        int j = nums.length-1;
        int sum = 0;
        int[] arr = {0,0};

        while (i < nums.length){
            while (i<j){
                sum = nums[i]+nums[j];
                if (sum==target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
                else {
                    j--;
                }
            }
            i++;
            j = nums.length-1;

        }
        return arr;
    }
}
