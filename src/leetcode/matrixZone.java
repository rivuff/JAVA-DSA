package leetcode;

import java.util.Arrays;

public class matrixZone {
    public static void main(String[] args) {
        int[][] arr= { {1,1,1}, {1,0,1},{1,1,1}};

        setZeroes(arr);
        for(int [] nums : arr){
            System.out.println(Arrays.toString(nums));
        }

    }

    public static void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){

                    Arrays.fill(matrix[i], 0);

                    for(int k = 0;k<n;k++){
                        matrix[k][j] = 0;
                    }
                }
            }
        }

    }
}
