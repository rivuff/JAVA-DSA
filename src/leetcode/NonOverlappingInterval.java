package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {2,3},{3,4}, {1,3}};
        eraseOverlapIntervals(intervals);

        System.out.println(eraseOverlapIntervals(intervals));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        int count = 1;
        int n = intervals.length;
        int prev= 0;
        for(int i = 1;i< n;i++){
            if(intervals[i][0]>=intervals[prev][0]){
                count++;
                prev = i;
            }

        }

        return n-count;
    }
}
