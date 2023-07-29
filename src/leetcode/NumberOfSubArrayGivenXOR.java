package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class NumberOfSubArrayGivenXOR {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        int m = 5;

        System.out.println(solve(arr, m));
    }

    public static int solve(int[] arr , int m){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int count = 0;
        int currXor = 0;

        map.put(0,1);

        for(int i = 0;i<n;i++){
            currXor^=arr[i];

            if(i>0 && arr[i]==m){
                count++;
            }
            if(map.containsKey(currXor^m)){
                count+=map.get(currXor^m);
            }

            map.put(currXor, map.getOrDefault(map.get(currXor), 0)+1);
        }

        return count;
    }
}
