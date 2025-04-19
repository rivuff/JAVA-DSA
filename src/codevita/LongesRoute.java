package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class LongesRoute {
    static int m;
    static int n;
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        m = scr.nextInt();
        n = scr.nextInt();
        int h = scr.nextInt();

        int[][] arr = new int[m][n];
        for(int[] num : arr){
            Arrays.fill(num,0);
        }


        while (h-->0){
            int x=scr.nextInt();
            int y = scr.nextInt();

            arr[x][y] =-1;
        }

        int rStart = scr.nextInt();
        int cStart = scr.nextInt();

        int rEnd = scr.nextInt();
        int cEnd = scr.nextInt();


        System.out.println(solve(rStart, cStart, rEnd, cEnd, arr, 0));

    }

    static int solve(int row, int col, int rEnd, int cEnd, int[][] arr, int count) {
        if (row == rEnd && col == cEnd) {
            return count;
        }

        if (row < 0 || row >= m || col < 0 || col >= n || arr[row][col] == -1) {
            return -1;
        }

        int temp = arr[row][col];
        arr[row][col] = -1; // Mark as visited

        int val1 = solve(row + 1, col, rEnd, cEnd, arr, count + 1);
        int val2 = solve(row - 1, col, rEnd, cEnd, arr, count + 1);
        int val3 = solve(row, col + 1, rEnd, cEnd, arr, count + 1);
        int val4 = solve(row, col - 1, rEnd, cEnd, arr, count + 1);

        arr[row][col] = temp; // Backtrack, mark as unvisited

        return Math.max(val1, Math.max(val2, Math.max(val3, val4)));
    }
}
