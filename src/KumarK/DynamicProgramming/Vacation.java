package KumarK.DynamicProgramming;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n  = scr.nextInt();

        int[][] arr= new int[n+1][3];

        for(int i =0;i<n;i++){
            for(int j =0;j<3;j++){
                arr[i][j] = scr.nextInt();
            }

        }

        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];
        int[] dp3 = new int[n+1];
        dp1[1] = arr[0][0];
        dp2[1] = arr[0][1];
        dp3[1] = arr[0][2];

        for(int i =1;i<n;i++){

        }
    }
}
