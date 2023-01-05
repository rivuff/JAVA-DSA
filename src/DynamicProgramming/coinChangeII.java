package DynamicProgramming;

import java.util.Arrays;

public class coinChangeII {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};

        System.out.println(solve(0,amount,coins));
    }

    public static int solve(int ind, int amount, int[] coins){

        if(amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(ind>=coins.length){
            return 0;
        }

        int take = solve(ind,amount - coins[ind],coins);
        int notTake = solve(ind+1, amount, coins);

        return take+notTake;
    }
}
