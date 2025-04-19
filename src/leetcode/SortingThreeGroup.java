package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingThreeGroup {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3,3};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println(minimumOperations(list));
    }

    public static int minimumOperations(List<Integer> nums) {
        int n = nums.size();
        int min = Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                int count = 0;
                for(int k =0;k<n;k++){
                    if(i>=k && j>=k){
                        if(nums.get(k)!=1){
                            count++;
                        }
                    }
                    else if(i<=k && j>k){
                        if(nums.get(k)!=2){
                            count++;
                        }
                    }
                    else if(i>=k && j<=k){
                        if(nums.get(k)!=3){
                            count++;
                        }
                    }
                }
                min = Math.min(min, count);
            }
        }

        return min;
    }
}
