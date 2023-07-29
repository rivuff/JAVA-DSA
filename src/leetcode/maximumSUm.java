package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class maximumSUm {
    public static void main(String[] args) {
        int[] arr = {51, 71, 17, 42};

        System.out.println(solve(arr));
    }
    static int solve(int[] arr ){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i<n;i++){
            int num  = arr[i];
            int sum  = 0;
            while(num>0){
                sum+=num%10;
                num=num/10;
            }

            if(map.containsKey(sum)){
                max = Math.max(max, map.get(sum)+arr[i]);
                map.put(sum , Math.max(map.get(sum), arr[i]));

            }
            else {
                map.put(sum, arr[i]);
            }
        }


        return max;
    }
}
