package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class topKFreq {
    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        int[] arr = topKFrequent(nums,2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] arr = new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int n = map.size();

        int count = 0;
        int i =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            count++;
            if(count<=k){
                arr[i] = entry.getKey();
                i++;
            }
        }
        return arr;
    }
}
