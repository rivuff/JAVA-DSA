package leetcode;

import java.util.Arrays;

public class reverseWords {
    public static void main(String[] args) {
        String s = "hello    world";

        String[] str = s.split(" ");
        int n = str.length;

        String ans = new String();
        ans = "";
        for (int i = n-1; i >=0; i--) {
            if (str[i]==""){
                continue;
            }
            else {
                ans = ans+str[i];
                ans+=" ";
            }
        }
        int m = ans.length();

        ans = ans.substring(0,m-1);
        System.out.println(ans);
    }

//    static String[] solve(String s){
//
//
//
//    }
}
