package college;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        String str = Integer.toString(n);
        int i = 0;
        int m = str.length()-1;
        int flag = 0;
        if(m%2==0){
            while (i<m){
                if(str.charAt(i)==str.charAt(m)){
                    i++;
                    m--;
                }
                else {
                    System.out.println(false);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(true);
            }

        }else {
            while (i<=m){
                if(str.charAt(i)==str.charAt(m)){
                    i++;
                    m--;
                }
                else {
                    System.out.println(false);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(true);
            }
        }
    }
}
