package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class greatestValue {
    public static void main(String[] args) {
        int[] nums = {4,3,9,16,8,2};
        System.out.println(solve(nums));
    }

    static int solve(int[] nums){
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        int count = 0;
        for(int i=0;i<n;i++){
            int a = nums[i];

            int count1=0;
            while(set.contains((int)Math.pow(a,2))){
                count1++;
                a=(int) Math.pow(a,2);
                set.remove(a);
            }
            if(count1>0){
                count =Math.max(count,count1+1);
            }
        }
        return count;
    }
}
