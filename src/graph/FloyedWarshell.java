package graph;

import java.util.Arrays;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Double.NEGATIVE_INFINITY;



public class FloyedWarshell {

    private double[][] dp;
    private int n;
    private int[][] next;
    private boolean solved;

    private static final int REACHES_NEGATIVE_CYCLE = -1;


    public static double[][] createGraph(int n){
        double matrix[][] = new double[n][n];

        for(int i =0;i<n;i++){
            Arrays.fill(matrix[i], POSITIVE_INFINITY);
            matrix[i][i] = 0;
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 7;
        double[][] m = createGraph(n);

        // Add some edge values.
        m[0][1] = 2;
        m[0][2] = 5;
        m[0][6] = 10;
        m[1][2] = 2;
        m[1][4] = 11;
        m[2][6] = 2;
        m[6][5] = 11;
        m[4][5] = 1;
        m[5][4] = -2;


    }

    public FloyedWarshell(int[][] m){
        n= m.length;
        dp = new double[n][n];
        next = new int[n][n];

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                dp[i][j] = m[i][j];

                if(m[i][j] != POSITIVE_INFINITY){
                    next[i][j] = j;
                }
            }
        }
    }

    public void solve(){
        if(solved) return;

        for(int k = 0;k<n;k++){
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    if(dp[i][k] + dp[k][j]< dp[i][j]){
                        dp[i][j] = dp[i][k] + dp[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }

        for(int k=0;k<n;k++){
            for(int i =0;i<n;i++){
                for(int j = 0;j<n;j++){
                    if(dp[i][k]!= POSITIVE_INFINITY && dp[j][k] != POSITIVE_INFINITY && dp[k][k]<0){
                            dp[i][j] = NEGATIVE_INFINITY;
                            next[i][j] = REACHES_NEGATIVE_CYCLE;
                    }
                }
            }
        }

        solved = true;
    }
}
