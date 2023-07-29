package leetcode;

import java.util.HashMap;

public class longesSubarraySumK {
    public static void main(String[] args) {
        int n =17;
        int k = 15;
        int[] arr=  {-13, 0, 6, 15, 16 ,2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};

        System.out.println(lenOfLongSubarr(arr, n, k));
    }

    public static int lenOfLongSubarr (int A[], int n, int k) {
        //Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxSize = 0;

        for(int i = 0;i< n;i++){
            sum+=A[i];

            if(A[i]==k && maxSize ==0){
                maxSize = 1;
            }

            if(sum == k){
                maxSize = Math.max(maxSize, i+1);
            }

            if(map.containsKey(sum-k)){
                maxSize = Math.max(maxSize, i- map.get(sum-k));
            }else{
                if(map.containsKey(sum)){
                    continue;
                }
                map.put(sum, i);
            }
        }

        return maxSize;
    }
}
