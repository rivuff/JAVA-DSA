package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class freq {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {0, -5, -2, -4, 2, -2, -3, -1, -1, -3 };
        System.out.println(maxFrequencyNumber(n, arr));
    }

    public static int maxFrequencyNumber(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(!map.containsKey(arr[i])){
                list.add(arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

        }

        int freq = map.get(arr[0]);
        int ans = arr[0];

        for(int num : list){
            if(map.get(num)>freq){
                freq = map.get(num);
                ans = num;
            }
        }

        return ans;
    }
}
