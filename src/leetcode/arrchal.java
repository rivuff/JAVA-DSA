package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrchal {
    public static void main(String[] args) {
        String str = "Hello-LOL";

        System.out.println(StringChallenge(str));

    }

    public static String StringChallenge(String str) {
        // code goes here
        int n = str.length();
        for(int i = 0;i<n;i++){
            int a = str.charAt(i);

            if(a>=97 && a<=122){
                int x = a-32;
                char av = (char) x;
                str = str.substring(0, i) + av + str.substring(i+1);
            }
            else if(a>=65 && a<=90){
                int x = a+32;
                char av = (char)x;
                str = str.substring(0, i) + av + str.substring(i+1);
            }
        }
        return str;
    }


}
