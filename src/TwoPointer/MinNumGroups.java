package TwoPointer;

import java.util.Arrays;

public class MinNumGroups {
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,8,9,2};
        System.out.println(solve(arr, 3));
    }

    static int solve(int[] arr, int k){
        int n = arr.length;
        Arrays.sort(arr);

        int i =0;
        int j = 0;
        int min = arr[0];
        int count = 1;
        while (j<n){
            if(arr[j]-min<=k){
                j++;
            }else {
                count++;
                i = j;
                min = arr[i];
            }
        }

        return count;
    }
}
