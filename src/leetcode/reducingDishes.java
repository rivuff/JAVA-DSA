package leetcode;

import java.util.Arrays;

public class reducingDishes {
    public static void main(String[] args) {
        int[] arr = {-1,-8,0,5,-9};
        System.out.println(solve(arr));
    }

    public static int solve(int[] satisfaction){
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int presum = 0, res = 0;
        for (int i = n - 1; i >= 0; i--) {
            presum += satisfaction[i];
            if (presum < 0) {
                break;
            }
            res += presum;
        }
        return res;
    }
}
