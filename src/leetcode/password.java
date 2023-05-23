package leetcode;

import java.util.HashMap;

public class password {
    public static void main(String[] args) {
        String str = "Zz}0///|";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str) {
        // Write your code here.
        if(str.length()<8 || str.length()>15){
            return false;
        }
        if(str.contains(" ")){
            return false;
        }
        int n = str.length();
        boolean cap = false;
        boolean small = false;
        boolean spc = false;
        boolean num = false;


        for(int i =0;i<n;i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                cap = true;
            }
            else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                small = true;
            }
            else if( str.charAt(i) -'0' >=0 && (int)str.charAt(i)-'0'<=9){
                num = true;
            }
            else if(!Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))){
                spc = true;
            }

            if(cap && small && num && spc){
                return true;
            }
        }
        return false;
    }
}
