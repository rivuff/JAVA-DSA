package codevita;

import java.util.Scanner;

public class Primevilla {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int[][] arr = {
                {1,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,0,1,1,1,0},
                {0,0,1,1,1,0},
                {0,0,1,1,1,0}
        };

        int n = arr.length;
        int m = arr[0].length;
        int maxCount = 0;
        int xPos = -1;
        int yPos = -1;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==0 && j==0){
                    continue;
                }
                int count=0;
                if(i+1<n && j+1<m && arr[i+1][j+1]==1){
                    count++;
                }
                if(i+1<n && arr[i+1][j]==1){
                    count++;
                }
                if(j+1<m && arr[i][j+1]==1){
                    count++;
                }
                if(i-1>0 && j-1>0 && arr[i-1][j-1]==1){
                    if(i==0&&j==0){
                        continue;
                    }
                    count++;
                }
                if(i-1>0 && j+1<m && arr[i-1][j+1]==1){
                    if(i==0&&j==0){
                        continue;
                    }
                    count++;
                }
                if(i+1<n && j-1>0 && arr[i+1][j-1]==1){
                    if(i==0&&j==0){
                        continue;
                    }
                    count++;
                }
                if(i-1>0 && arr[i-1][j]==1){
                    if(i==0&&j==0){
                        continue;
                    }
                    count++;
                }
                if( j-1>0 && arr[i][j-1]==1){
                    if(i==0&&j==0){
                        continue;
                    }
                    count++;
                }

                if(count>maxCount){
                    maxCount = count;
                    xPos = i+1;
                    yPos = j+1;
                }
            }
        }

        System.out.println(xPos + ":" +yPos+":" + maxCount );
    }
}
