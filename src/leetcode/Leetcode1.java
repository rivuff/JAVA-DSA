package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Leetcode1 {
    public static void main(String[] args) {
        //Scanner scr = new Scanner(System.in);
        int[] prices = {10, 1 , 1 , 6};

        int n= prices.length-1;
        int[] ans = new int[n+1];
        Arrays.fill(ans, -1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(n>=0){
            if(n==prices.length-1){
                ans[n] = prices[n];
                pq.add(prices[n]);
            }else{
                while(!pq.isEmpty()){
                    if(pq.peek()< prices[n]){
                        int val = prices[n] - pq.peek();
                        pq.add(prices[n]);
                        ans[n]= val;
                        break;
                    }else{
                        pq.poll();
                    }
                }

                if(ans[n]==-1){
                    ans[n] = prices[n];
                    pq.add(prices[n]);
                }

            }
            n--;
        }

        System.out.println(Arrays.toString(ans));
    }
}
