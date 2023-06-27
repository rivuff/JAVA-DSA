package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class mergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{2,3},{4,5},{6,7},{8,9},{1,10}};

        int[][] arr= merge(intervals);

        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
    }

    public static int[][] merge(int[][] intervals) {
        HashSet<int[]> set = new HashSet<>();
        int n = intervals.length;
        set.add(intervals[0]);

        for(int i =1;i<n;i++){
            int flag = 0;
            for(int[] arr : set){
                if(intervals[i][0]>=arr[0] && intervals[i][0]<=arr[1] ){
                    arr[1] = Math.max(arr[1], intervals[i][1]);
                    flag=1;
                    break;
                }
                else if(intervals[i][1]>=arr[0] && intervals[i][1]<=arr[1]){
                    arr[0] = Math.min(arr[1], intervals[i][0]);
                    flag=1;
                    break;
                }
                else if(intervals[i][0]<arr[0] && intervals[i][1]>arr[1] ){
                    arr[1] = Math.max(arr[1], intervals[i][1]);
                    arr[0] = Math.min(arr[1], intervals[i][0]);
                    flag=1;
                    break;
                }

            }

            if(flag==0){
                set.add(intervals[i]);
            }
        }

        int[][] ans = new int[set.size()][2];
        int ind = 0;
        for(int[] arr : set){
            ans[ind] = arr;
            ind++;
        }

        return ans;
    }
}
