package CompanyBased.Accenture;

import java.util.Scanner;

public class Hyphen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.next();//"Move-Hyphen-to-front";
        int n  =scr.nextInt();
        System.out.println(moveHyphen(str, n));
    }

    static String moveHyphen(String str, int n){
        String newStr = "";

        for(int i =0;i<n;i++){
            if(str.charAt(i)!='-'){
                newStr+= str.charAt(i);
            }
        }

        int m = newStr.length();

        int p = n-m;

        for(int i =0;i<p;i++){
            newStr = '-'+newStr;
        }

        return newStr;
    }
}
