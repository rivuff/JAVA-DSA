package KumarK.Hashmap;


// Given an array of size “N” ; find the maximum sum subarray which has the same elements in the start and end

import java.util.HashMap;
import java.util.Scanner;

public class maximumSumSubarraySameStartEnd {
    public static void main(String[] args) {
       // Scanner scr = new Scanner(System.in);

        int[] arr = {1, 8, 10, 8, -5, 8};

        System.out.println(solve(arr));
    }

    static int solve(int[] arr){
        int sum =0;
        int n = arr.length;
        int[] prefixSum = new int[n];

        for(int i=0;i<n;i++){
            sum+=arr[i];
            prefixSum[i] = sum;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxSubArraySum = arr[0];

        map.put(arr[0], 0);
        for(int i=1;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], prefixSum[i-1]);
            }else{
                map.put(arr[i], Math.min(map.get(arr[i]), prefixSum[i-1]));
                maxSubArraySum = Math.max(maxSubArraySum, prefixSum[i]-map.get(arr[i]));
            }
        }

        return maxSubArraySum;
    }
}
