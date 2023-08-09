package KumarK.Hashmap;

import java.util.HashMap;

public class GoogleOAParis {
    public static void main(String[] args) {
        int[] arr = {1,2,6,6,5};
        System.out.println(solve(arr));
    }

    public static int solve(int[] arr){
        int n = arr.length;
        int max =0;
        int maxInd = -1;
        int secondMax = 0;

        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                maxInd = i;
            }
        }
        for(int i =0;i<n;i++){
            if(i!=maxInd && arr[i]>secondMax){
                secondMax = arr[i];
            }
        }

        int maxTar = max+secondMax;

        int tar = 1;
        int count = 0;
        while (tar<=maxTar){
            count = Math.max(count, maxOperations(arr, tar));
            tar++;
        }

        return count;
    }

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        for (int i = 0; i < n; i++) {
            int x = k-nums[i];
            mp.put(nums[i], mp.get(nums[i])-1);

            if (mp.containsKey(x) && mp.get(x)>0 && mp.get(nums[i])>=0){
                count++;
                mp.put(x,mp.get(x)-1);
            }
            else mp.put(nums[i], mp.get(nums[i])+1);
        }
        return count;
    }
}
