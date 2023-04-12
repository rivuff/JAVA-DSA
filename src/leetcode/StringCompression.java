package leetcode;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] ch = {'a','a','b','b','c','c','c'};
        System.out.println(compress(ch));
    }

    public static int compress(char[] chars) {
        String str = new String();
        int n = chars.length;
        int count = 1;
        char a = chars[0];
        if(n==1){
            str+=chars[0];
            return 1;
        }
        for(int i = 1; i<n; i++){

            if(chars[i]==chars[i-1]){
                count++;
            }
            else {
                str += chars[i-1];
                if(count!=1){
                    str+= count;
                }
                count = 1;
            }

            if(i==n-1){
                str +=chars[i];
                if(count!=1){
                    str+= count;
                }
            }

        }

        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(chars));

        return str.length();
    }
}
