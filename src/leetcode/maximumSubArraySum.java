package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class maximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        int k =3;

        System.out.println(maximumSubarraySum(arr,k));
    }


    public static long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int ind = 0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            Queue<Integer> q = new LinkedList<>();
            if(!flag){
                int temp = 0;
                for (int j = i; j < k; j++) {
                    if(q.contains(nums[j])){
                        break;
                    }
                    else {
                        q.add(nums[j]);
                        temp+=nums[j];
                        if (j==i+k-1){
                            flag=true;
                            i=j;
                        }
                    }
                    if (flag){
                        sum=Math.max(sum,temp);
                    }
                }
            }
            else {
                int j = i;
                while (j<n) {
                    int temp = sum;
                    if (j + k < n) {

                        for (int l = j; l < j + k; l++) {
                            if (q.contains(nums[l])) {
                                flag = false;
                                break;
                            } else {
                                temp = temp - nums[l - k + 1] + nums[l];
                                q.poll();
                                q.add(nums[l]);
                            }
                        }

                        if (flag) {
                            sum = Math.max(sum, temp);
                        }
                        j++;
                    }
                }
            }

        }
        return sum;

    }



}
