package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class largestElementInArray {
    public static void main(String[] args) {
        int[] nums = {5,3,3};
        System.out.println(maxArrayValue(nums));
    }

    public static long maxArrayValue(int[] nums) {


        List<Long> list = new ArrayList<>();

        for(int num : nums){
            list.add((long)num);
        }

        for(int i = list.size()-1;i>=1;i--){
            if(list.get(i)>=list.get(i-1)){
                long a = list.get(i)+list.get(i-1);
                list.remove(i);
                list.remove(i-1);
                list.add(i-1, a);
            }
        }

        long max = 0;
        for(long num : list){
           max=  Math.max(max, num);
        }

        return max;

//        int n = nums.length;
//        List<Integer> list = new ArrayList<>();
//
//        for(int num : nums){
//            list.add(num);
//        }
//        boolean bol = true;
//
//        while(bol){
//
//            for(int i = list.size()-1;i>=1;i--){
//                if(list.get(i)>=list.get(i-1)){
//                    int a = list.get(i)+list.get(i-1);
//                    list.add(i-1, a);
//                }
//            }
//
//
//
//            int count = 0;
//            for(int i = list.size()-1;i>=1;i--){
//                if(list.get(i)<list.get(i-1)){
//                    count++;
//                }
//            }
//
//            if(count == list.size()-1){
//                bol = false;
//            }
//
//
//        }
//        int max = 0;
//        for(int num : list){
//            Math.max(max, num);
//        }
//
//        return max;
    }
}
