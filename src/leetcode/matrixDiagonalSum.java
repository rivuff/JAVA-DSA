package leetcode;

public class matrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},{1,1,1,1}, {1,1,1,1},{1,1,1,1}};

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i<n && j<m){
            sum +=mat[i][j];
            i++;
            j++;
        }

        i = 0;
        j--;

        while(i<n && j>=0){

            if(i==j){
                i++;
                j--;
            }

            sum +=mat[i][j];
            i++;
            j--;
        }

        return sum;
    }
}
