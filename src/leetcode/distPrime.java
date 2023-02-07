package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class distPrime {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8};
        System.out.println(solve(nums));
    }

    static int solve(int[] nums){
        int n = nums.length;
        List<int[]> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){

            int c = 2;
            while (nums[i] > 1) {
                if (nums[i] % c == 0) {
                    set.add(c);
                    nums[i] /= c;
                }
                else
                    c++;
            }
        }

        return set.size();

    }



}
