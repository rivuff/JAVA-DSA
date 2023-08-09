package KumarK.Hashmap;

public class RangeSum {
    static int[][] mat;
    public static void main(String[] args) {
        mat = new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        System.out.println(sumRegion(2,1,4,3));
    }

    public static int sumRegion(int row1, int col1, int row2, int col2) {
        int minRow = Math.min(row1, row2);
        int maxRow = Math.max(row1, row2);

        int minCol = Math.min(col1, col2);
        int maxCol = Math.max(col1, col2);

        int sum = 0;

        for(int i = minCol; i<=maxCol; i++){
            for(int j = minRow; j <= maxRow;j++){
                sum += mat[j][i];
            }
        }

        return sum;
    }
}
