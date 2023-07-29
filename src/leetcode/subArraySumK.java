package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class subArraySumK {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,0,0};

        System.out.println(subarraySum(nums, 0));
    }

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;

        for(int i = 0;i<n;i++){

            sum+=nums[i];

            if(sum == k){
                count++;
            }

            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);

        }

        return count;
    }
}
