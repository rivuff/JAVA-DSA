package KumarK.Hashmap;

import java.util.HashMap;

public class shortestLenSubArr {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9,8,7};
        int k = 15;

        System.out.println(solve(arr, k));
    }

    static int solve(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int n = arr.length;
        int len = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            sum+=arr[i];

           if(sum==k){
               if(len>i){
                   len =i+1;
               }
           }

           if(map.containsKey(sum - k)){
               int length = i - map.get(sum-k);
               len = Math.min(len, length);
           }

           map.put(sum, i);

        }

        return len;
    }
}
