package leetcode;

import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        int[][] arr ={{0,0,7}};
        int n = 1;

        System.out.println(matrixSumQueries(n,arr));
    }

    public static long matrixSumQueries(int n, int[][] queries) {
        long[][] matrix = new long[n][n];

        for (int[] query : queries) {
            int type = query[0];
            int index = query[1];
            int val = query[2];

            if (type == 0) {

                Arrays.fill(matrix[index], val);
            } else if (type == 1) {

                for (int i = 0; i < n; i++) {
                    matrix[i][index] = val;
                }
            }
        }

        long sum = 0;
        for (long[] row : matrix) {
            for (long num : row) {
                sum += num;
            }
        }

        return sum;

    }
}
