package CompanyBased.Accenture;

import java.util.Scanner;

public class Opt {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String str =  scr.next();

        int n =str.length();
        if(n==0){
            System.out.println(-1);
        }
        else {
            int a = str.charAt(0) - '0';

            int i =1;
            while (i+1<n){
                int b = str.charAt(i+1) - '0';
                if(str.charAt(i)=='A'){
                    a = a&b;
                }else if(str.charAt(i)=='B'){
                    a= a|b;
                }else if(str.charAt(i)=='C'){
                    a = a^b;
                }
                i+=2;
            }

            System.out.println(a);
        }

    }
}
