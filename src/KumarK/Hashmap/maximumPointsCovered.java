package KumarK.Hashmap;

import java.util.Arrays;

public class maximumPointsCovered {
    public static void main(String[] args) {

    }

    static int solve(int[][] mat, int x, int y){
        int n = mat.length;

        int row=0, col=0;
        for(int i=0; i<n; i++){
            if(mat[i][1]>row) row= mat[i][1];
            if(mat[i][0]>col) col= mat[i][0];
        }

        int[][] prefMat = new int[row+1][col+1];

        for(int[] num : prefMat){
            Arrays.fill(num, 0);
        }

        for(int i=0; i<n; i++){
            prefMat[mat[i][1]][mat[i][0]]+= 1;
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){

            }
        }
        return -1;

    }
}
