package leetcode;

import java.util.Arrays;

public class putMarbel {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,2};
        System.out.println(solve(arr,3));
    }

    static long solve(int[] W, int k){
        int n = W.length;
        int [] pairs = new int[n-1];
        for(int i = 1;i<n;i++){
            pairs[i-1] = W[i]+W[i-1];
        }
        Arrays.sort(pairs);
        long min = 0;long max = 0;
        for(int i = 0;i<k-1;i++){
            min+=pairs[i];
            max+=pairs[n-i-2];
        }
        return max-min;
    }
}
