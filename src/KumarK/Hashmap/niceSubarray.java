package KumarK.Hashmap;

import java.util.HashMap;

public class niceSubarray {
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(solve(arr, k));
    }

    static int solve(int[] arr,int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                arr[i]=0;
            }
            else arr[i]=1;
        }

        int cnt = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int rem=0;
        int sum=0;
        int n = arr.length;
        mp.put(0,1);
        for (int i = 0; i < n; i++) {
            sum+=arr[i];

            rem = sum-k;

            if (mp.containsKey(rem)){
                cnt+=mp.get(rem);

            }
            mp.put(sum, mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
