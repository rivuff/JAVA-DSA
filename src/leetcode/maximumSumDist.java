package leetcode;

import java.util.TreeSet;

public class maximumSumDist {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }

    static long maximumSubarraySum(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        int n = nums.length;

        for(int i =0;i<n;i++){
            set.add(nums[i]);
        }

        if(set.size()<k){
            return 0;
        }
        int sum = 0;

        while(k!=0){
            int val = set.last();
            sum+=val;
            set.pollLast();
            k--;
        }

        return sum;
    }
}

