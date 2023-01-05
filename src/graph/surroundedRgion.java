package graph;

import java.util.Arrays;

public class surroundedRgion {
    public static void main(String[] args) {

    }

    public static void dfs(int i, int j, int[][] vis, char[][] mat, int[] delrow, int[] delcol){
        vis[i][j]=1;
        int n = mat.length;
        int m = mat[0].length;

        for(int k =0;k<4;k++){
            int nrow = i+delrow[k];
            int ncol = j+delcol[k];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && mat[nrow][ncol]=='0'){
                dfs(nrow,ncol,vis,mat,delrow,delcol);
            }
        }
    }
    public void solve(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] vis = new int[n][m];

        for (int[] arr : vis) {
            Arrays.fill(arr, 0);
        }

        int[] delrow = {1, 0, -1, 0};
        int[] delcol = {0, 1, 0, -1};

        for (int j = 0; j < m; j++) {
            if (mat[0][j] == '0' && vis[0][j] == 0) {
                dfs(0, j, vis, mat, delrow, delcol);
            }

            if (mat[n - 1][j] == '0' && vis[n - 1][j] == 0) {
                dfs(n - 1, j, vis, mat, delrow, delcol);
            }
        }

        for (int i = 0; i < n; i++) {
            if (mat[i][0] == '0' && vis[i][0] == 0) {
                dfs(i, 0, vis, mat, delrow, delcol);
            }
        }

        for (int i = 0; i < n; i++) {
            if (mat[i][m - 1] == '0' && vis[i][m - 1] == 0) {
                dfs(i, m - 1, vis, mat, delrow, delcol);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == '0' && vis[i][j] == 0) {
                    mat[i][j] = 'x';
                }
            }
        }
    }
}
