package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class subset {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        solve(nums,0,new ArrayList<>(), outer );
        for(List<Integer> list : outer){
            set.add(list);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(List<Integer> list : set){
            ans.add(list);
        }
        return ans;

    }

    public static void solve(int[] nums, int index, List<Integer> inner, List<List<Integer>> outer){
        if(index==nums.length){
            outer.add(new ArrayList<>(inner));
            return;
        }

        inner.add(nums[index]);
        solve(nums, index+1,inner,outer);
        inner.remove(inner.size()-1);
        solve(nums,index+1,inner,outer);
    }

}
