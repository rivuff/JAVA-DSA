package leetcode;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scr.nextInt();
        }
        int k = scr.nextInt();

        System.out.println(minCapability(arr, k));
    }

    public static int minCapability(int[] A, int k) {
        int left = 1, right = (int)1e9, n = A.length;
        while (left < right) {
            int mid = (left + right) / 2, take = 0;
            for (int i = 0; i < n; ++i)
                if (A[i] <= mid) {
                    take += 1;
                    i++;
                }
            if (take >= k)
                right = mid;
            else
                left = mid + 1;
        }
        return left; //left == right
    }
}
