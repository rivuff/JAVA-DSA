package leetcode;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

    public static int numSquares(int n) {
        return solve(0, 1, 0, n);
    }

    public static int solve(int count, int value, int sum, int n){
        if(sum == n){
            return count;
        }
        if(sum>n){
            return Integer.MAX_VALUE;
        }
        int take = 0;

        if(sum<n){
            take = solve(count+1, value, sum += value*value, n);
        }

        int notTake = solve(count, value+1, sum, n);

        return Math.min(take, notTake);

    }
}
