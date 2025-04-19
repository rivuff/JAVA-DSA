package codevita;

import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int a = scr.nextInt();

        int x = n-a;

        int ans = x/(a+1);
        int oth = x%(a+1);

        if(oth==0){
            System.out.print(ans);
        }else System.out.print(ans+1);


    }
}
