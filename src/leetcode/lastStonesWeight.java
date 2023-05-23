package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class lastStonesWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for(int each : stones){
            pq.add(each);
        }


        while (pq.size()>1){
            int top1 = pq.poll();
            int top2=pq.poll();
            int diff = Math.abs(top1-top2);

            if(diff!=0){
                pq.add(diff);
            }
        }

        if(pq.size()!=0){
            return pq.poll();
        }
        else return 0;


    }
}
