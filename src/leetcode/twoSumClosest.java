package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class twoSumClosest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int target = scr.nextInt();
        int[] nums = new int[n];

        for(int i =0;i<n;i++) {
            nums[i] = scr.nextInt();
        }

        Arrays.sort(nums);
        int[] result = new int[2];
        int minDiff = Integer.MAX_VALUE;
        for (int lo = 0, hi = nums.length - 1; lo < hi; ) {
            int sum = nums[lo] + nums[hi];
            int diff = Math.abs(target - sum);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = nums[lo];
                result[1] = nums[hi];
            }
            if (sum < target) {
                lo++;
            } else if (sum > target) {
                hi--;
            } else {
                break;
            }
        }

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
