package leetcode;

import java.util.HashMap;

public class numberOfPairsDifK {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        System.out.println(countKDifference(nums, 1));
    }

    public static int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i = 0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int count = 0;

        for(int key : map.keySet()){
            int a = key;

            int req = a+k;

            if(map.containsKey(req)){
                count+= map.get(a)* map.get(req);
            }
        }

        return count;
    }
}
