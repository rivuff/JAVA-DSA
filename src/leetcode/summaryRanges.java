package leetcode;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,8};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> list = new ArrayList<>();
        int i;
        for(i = 1;i<n;i++){
            int a = nums[i-1];
            int count = 0;
            while(i<n && nums[i]==nums[i-1]+1){
                count++;
                i++;
            }

            if(count==0){
                list.add(String.valueOf(a));
            }
            else{
                list.add((char) a + "->" + (char) nums[i - 1]);
            }
        }

        if(nums[n-2]+1 !=nums[n-1]){
            list.add(String.valueOf(nums[n-1]));
        }


        return list;
    }
}
