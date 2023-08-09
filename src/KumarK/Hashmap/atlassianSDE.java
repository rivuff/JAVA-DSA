package KumarK.Hashmap;


//Given an array of size N ;  find the maximum sum subarray which has a difference of "k" between the start and end elements of the array
//
//        N = 8
//
//        K = 5
//
//        1 5 -5 8 8 8 10 15
//
//        Output - [5 -5 8 8 8 10] = 34. (also difference b/w start and end element is abs(5-10) = 5

import java.util.HashMap;

public class atlassianSDE {
    public static void main(String[] args) {
        int[] arr = {1,5,-5,8,8,8,10};
        int k=5;

        System.out.println(solve(arr, k));
    }

    public static int solve(int[] arr, int k){
        int n = arr.length;
        int[] prefixSum = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
            prefixSum[i] = sum;
        }
        int ans = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i =0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], prefixSum[i]);
            }
            else{
                map.put(arr[i], Math.min(map.get(arr[i]), prefixSum[i]));
            }


            if(map.containsKey(Math.abs(arr[i]-k))){
                ans = Math.max(ans, map.get(arr[i]) - map.get(Math.abs(arr[i]-k)));
            }else if(map.containsKey(arr[i]+k)){
                ans = Math.max(ans, map.get(arr[i]) - map.get(arr[i]+k));
            }
        }

        if(ans==Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
}
