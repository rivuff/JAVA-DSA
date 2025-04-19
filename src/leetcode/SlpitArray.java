package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SlpitArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(3);

        System.out.println(canSplitArray(list, 6));
    }

    public static boolean canSplitArray(List<Integer> nums, int m) {
        int prefixSum = 0;
        int n= nums.size();
        for(int i =0;i<n;i++){
            prefixSum +=nums.get(i);
        }

        int i = 0;
        int j = n-1;


        while(i<j && n>2){
            if(nums.get(j)>nums.get(i)){
                if(prefixSum - nums.get(i)>=m){
                    prefixSum -=nums.get(i);
                    i++;
                }
                else{
                    return false;
                }
            }
            else{
                if(prefixSum - nums.get(j)>=m){
                    prefixSum -= nums.get(j);
                    j--;
                }else{
                    return false;
                }
            }

            n--;
        }
        return true;
    }
}
