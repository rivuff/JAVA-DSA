package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class completeSUbarry {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,2};
        System.out.println(countCompleteSubarrays(arr));
    }

    public static int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int n =nums.length;
        int count =0;

        for(int num : nums){
            set.add(num);
        }

        for(int i =0;i<n;i++){
            HashSet<Integer> temp = new HashSet<>();
            for(int j =i;j<n;j++){
                temp.add(nums[j]);
                if(set.equals(temp)){
                    count++;
                }
            }
        }

        return count;
    }
}
