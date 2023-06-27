package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class equalRow {
    public static void main(String[] args) {
        int[][] arr = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};

        System.out.println(equalPairs(arr));
    }

    public static int equalPairs(int[][] grid) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        int count1 = 0;
        int count2 = 0;
        int n = grid.length;
        for(int[] arr: grid){
            set1.add(Arrays.toString(arr));
        }

        for(int i = 0;i<n;i++){
            int[] arr = new int[n];
            for(int j = 0;j<n;j++){
                arr[j] = grid[j][i];
            }
            set2.add(Arrays.toString(arr));
            if(set1.contains(Arrays.toString(arr))){
                count1++;
            }
        }

        for(int[] num : grid){
            if(set2.contains(Arrays.toString(num))){
                count2++;
            }
        }


        return Math.max(count1,count2);
    }
}
