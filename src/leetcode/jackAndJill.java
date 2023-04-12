package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class jackAndJill {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scr.nextInt();
        }
        int k = scr.nextInt();

        System.out.println(maxKelements(nums, k));
    }

    public static long maxKelements(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0;i<n;i++){
            pq.add(nums[i]);
        }
        long count = 0;
        while (k-->0){
            int a = pq.poll();
            //double x = a/3;
            int b =0;
            if(a%3==0){
                b=a/3;
            }
            else b=(a/3)+1;

            count+=a;
            pq.add(b);
        }

        return count;
    }
}
