package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class RemoveStones {
    public static void main(String[] args) {
        int[] piles = {4,3,6,7};
        int k =3;
        System.out.println(solve(piles,k));
    }

    static int solve(int[] piles, int k){
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            q.add(piles[i]);
        }

        while (k>0){
            int x = q.poll();

            x = Math.ceilDiv(x,2);
            q.add(x);
            k--;
        }

        int sum =0;
        while (!q.isEmpty()){
            sum+=q.poll();
        }

        return sum;
    }
}
