package Sorting;

import java.util.Scanner;

public class newq {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        char a = scr.next().charAt(0);
        int b = scr.nextInt();
       // int val = a;
        if((int)a >= 97 && (int) a<=122 ){
            a+=b;
            if(a>122){
                a= (char) (97 + (a-122)-1);
            }
        }else if((int)a>=65 && (int)a<=90){
            a+=b;
            if(a>90){
                a=(char) (65+(a-90)-1);
            }
        }

        System.out.println(a);
    }
}
