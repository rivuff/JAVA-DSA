package leetcode;

import java.util.HashMap;

public class countSubArr {
    public static void main(String[] args) {
        int[] nums = {35054,398719,945315,945315,820417,945315,35054,945315,171832,945315,35054,109750,790964,441974,552913};
        int minK = 35054;
        int maxK = 945315;

        int[] nus = {1,0,1,1};
        int k= 1;
        System.out.println(containsNearbyDuplicate(nus,k));

       // System.out.println(countSubarrays(nums,minK,maxK));
    }

//    public static long countSubarrays(int[] nums, int minK, int maxK) {
//
//    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k==0) return false;
        int n = nums.length;


        HashMap<Integer,Integer> map1 =new HashMap<>();

        for(int i=0;i<n;i++){
            if (map1.containsKey(nums[i]) && i-map1.get(nums[i])<=k){
                return true;
            }
            map1.put(nums[i],i);

        }

        return false;
    }
}
