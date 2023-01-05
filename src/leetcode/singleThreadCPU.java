package leetcode;

import java.util.*;

public class singleThreadCPU {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {2,4},
                {3,2},
                {4,1}
        };
        int[] ar = solve(arr);
        System.out.println(Arrays.toString(ar));
    }

     static int[] solve(int[][] tasks){
        int n = tasks.length;

        int[][] arr = new int[n][3];

         for (int i = 0; i < n; i++) {
             arr[i] = new int[] {i,tasks[i][1], tasks[i][0]};
         }

         Arrays.sort(arr,(a, b)->(a[2] - b[2]));

         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]!=b[1] ? (a[1]-b[1]) : (a[0]-b[0])));

         int i =0;
         int[] res = new int[n];
        int j =0;
        int start =0;
         while (!pq.isEmpty() || i<n){
             if (pq.isEmpty()){
                 int currTime = arr[i][2];
                 pq.add(arr[i]);
                 i++;

                 while (i<n && arr[i][2]==currTime){
                     pq.add(arr[i]);
                     i++;
                 }
             }

             else {
                 int[] curr = pq.poll();
                 res[j++] = curr[0];
                 int duration = curr[1];
                 start=Math.max(start,curr[2]);

                 int end = start+duration;

                 while (i < n && arr[i][2] <= end) {
                     pq.add(arr[i]);
                     i++;
                 }
                 start = end;
             }
         }
         return res;
    }
}
