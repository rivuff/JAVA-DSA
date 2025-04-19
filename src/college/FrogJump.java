package college;

import java.util.Arrays;
import java.util.HashMap;

public class FrogJump {
    static int n;
    public static void main(String[] args) {
        int[] stones = {0,1,3,5,6,8,12,17};
        System.out.println(canCross(stones));
    }


    public static boolean canCross(int[] stones) {
        n = stones.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<stones.length;i++){
            map.put(stones[i], i);
        }

        int[][] dp =new int[n+1][n+1];

        for(int[] num: dp){
            Arrays.fill(num,-1);
        }
        return solve(0,0, stones, map,dp);

    }

    public static boolean solve(int currInd, int prev, int[] stones, HashMap<Integer, Integer> map,int[][] dp){
        if(currInd==n-1){
            return true;
        }
        if(currInd==-1){
            return false;
        }

        if(dp[currInd][prev]!=-1){
            return dp[currInd][prev]== 1 ? true:false;
        }


        boolean left = false;
        boolean right = false;
        boolean mid = false;

        if(prev>1){
            left =  solve(map.getOrDefault(stones[currInd]+prev-1, -1), prev-1, stones, map,dp);
        }
        if(prev>0){
            mid = solve(map.getOrDefault(stones[currInd]+prev, -1), prev, stones, map,dp);

        }

        right= solve(map.getOrDefault(stones[currInd]+prev+1, -1), prev+1, stones, map,dp);
        dp[currInd][prev] = (left || right || mid)?1:0;
        return  (left || right || mid);
    }
}
