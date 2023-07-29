package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] ans = twoSum(nums, 6);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0;i<nums.length;i++){
                map.put(nums[i], i);
            }

            for(int i = 0;i<nums.length;i++){
                int rem = target - nums[i];

                if(map.containsKey(rem) && map.get(rem)!=i){
                    ans[0] = i;
                    ans[1] = map.get(rem);
                    break;
                }
            }

            return ans;
    }


}
