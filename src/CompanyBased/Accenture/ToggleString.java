package CompanyBased.Accenture;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String str = scr.next();

        int n =str.length();
        int val = Math.abs((int)'a' - (int)'A');
        for(int i =0;i<n;i++){
            if(str.charAt(i)>='A' && str.charAt(i) <= 'Z'){
                str = str.substring(0,i) + (char)(str.charAt(i)+val) + str.substring(i+1);
            }else if(str.charAt(i)>='a' && str.charAt(i) <= 'z'){
                str = str.substring(0,i) + (char)(str.charAt(i)-val) + str.substring(i+1);
            }
        }

        System.out.println(str);
    }
}
