package leetcode;

import java.util.ArrayList;
import java.util.List;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {2,1,1,3,1,4,5,6};
        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int candidate1 = -1;
        int candidate2 = -1;

        int count1=0;
        int count2 = 0;

        int count = 0;
        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        for(int i =0;i<n;i++){
            if(nums[i] == candidate1){
                count1++;
            }
            else if(nums[i] == candidate2){
                count2++;
            }
            else if(count1 == 0){
                candidate1 = nums[i];
                count1 = 1;
            }else if(count2 ==0){
                candidate2 = nums[i];
                count2 = 1;
            }else{
                count--;
                count2--;
            }

        }

        count1=0;
        count2 = 0;

        for(int i =0;i<n;i++){
            if(nums[i] == candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
        }

        if(count1>n/3){
            list.add(candidate1);
        }
        if(count2>n/3){
            list.add(candidate2);
        }

        return list;
    }
}
