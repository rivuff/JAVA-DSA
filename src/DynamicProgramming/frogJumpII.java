package DynamicProgramming;

import java.util.Arrays;

public class frogJumpII {
    public static void main(String[] args) {
        int[] stones = {0,4,6,8,16,20};
        System.out.println(maxJump(stones));
    }

    public static int maxJump(int[] stones) {
        int n = stones.length;

        if(n<=3){
            return stones[n-1]-stones[0];
        }
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < n-2; i=i+2) {
            max1 = Math.max(stones[i+2]-stones[i],max1);
        }
        for (int i = n-1; i >=2; i=i-2) {
            max2 = Math.max(stones[i]-stones[i-2],max2);
        }
        return Math.max(max1,max2);
    }

    
}
