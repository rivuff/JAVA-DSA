package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class dailyTemp {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] nums = dailyTemperatures(arr);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        Arrays.fill(arr,0);
        for(int i =0;i<n-1;i++){
            int a = temperatures[i];
            int count = 0;
            for(int j =i;j<n;j++){
                if(temperatures[j]>a){
                    arr[i] = count;
                    break;
                }
                else count++;
            }
        }
        return arr;
    }
}
