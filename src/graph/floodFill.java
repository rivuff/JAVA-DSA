package graph;

import java.util.Arrays;

public class floodFill {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};

        int[][] ans =  floodFill(image,1,1,2);

        System.out.println(Arrays.deepToString(ans));
    }

    public static void dfs(int[][] image, int row, int col, int color, int[][] ans, int inicolor, int[] delrow, int[] delcol){
        ans[row][col] = color;
        int n = image.length;
        int m = image[0].length;

        for(int i=0;i<4;i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && image[nrow][ncol]==inicolor && ans[nrow][ncol]!=color){
                dfs(image, nrow, ncol, color, ans, inicolor, delrow, delcol);
            }
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int inicolor = image[sr][sc];
        int[][] ans = image;

        int[] delrow = {1,0,-1,0};
        int[] delcol = {0,1,0,-1};

        dfs(image, sr, sc, color, ans, inicolor, delrow, delcol);

        return ans;
    }
}
