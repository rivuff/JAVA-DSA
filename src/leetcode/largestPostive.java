package leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;

public class largestPostive {
    public static void main(String[] args) {
        int[] nums = {-10,8,6,7,-2,-3};
        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int n = nums.length;
        for(int i = 0;i < n;i++){
            set.add(nums[i]);

            int a =nums[i];
            if(nums[i]>0){
                if(set.contains(-a)){
                    q.add(a);
                    set.remove(a);
                    set.remove(-a);
                }
            }
            else{
                if(set.contains(-a)){
                    q.add(-a);
                    set.remove(a);
                    set.remove(-a);
                }
            }

            if(q.size()>1){
                q.poll();
            }


        }
        if(q.isEmpty()){
            return -1;
        }


        return q.peek();
    }
}
