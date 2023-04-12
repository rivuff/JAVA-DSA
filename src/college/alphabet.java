package college;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        String str;
        char[][] arr;
        str = scr.next();
        arr = new char[n][str.length()];
        arr[0]=str.toCharArray();

        for(int i =1;i<n;i++){
            str = scr.next();
            arr[i]=str.toCharArray();
        }
        char k = scr.next().charAt(0);
        int m = arr[0].length;
        int c = 0;
        int l = 0;

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(arr[i][j]==k){
                    c = i;
                    l = j;
                    break;
                }
            }
        }

        for (int i = 0;i<l;i++){
            System.out.print(arr[c][i]);
        }

        System.out.println();

        for(int i = 0;i<c;i++){
            System.out.print(arr[i][l]);
        }

    }
}
