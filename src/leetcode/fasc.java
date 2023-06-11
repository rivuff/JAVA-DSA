package leetcode;

import java.util.Arrays;

public class fasc {
    public static void main(String[] args) {
        String n = "0995229";

        System.out.println(longestSemiRepetitiveSubstring(n));
    }

    public static int longestSemiRepetitiveSubstring(String s) {
        int n = s.length();
        if (n <= 2) {
            return n;
        }

        int maxLength = 1;

        int size = 2;


        for(int i = 2;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1) && s.charAt(i)==s.charAt(i-2)){
                size=2;
            }
            else if((i+1<n) && s.charAt(i-2)==s.charAt(i-1) && s.charAt(i)==s.charAt(i+1)){
                size++;
                maxLength = Math.max(size, maxLength);
                size = 3;
                i++;
            }else{
                size++;
            }

            maxLength = Math.max(size, maxLength);
        }

        return maxLength;
    }
}


//int count = 1;
//        for (int i = 1; i < n; i++) {
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                count++;
//                i = i+2;
//                maxLength = Math.max(maxLength, size);
//                if (count > 2) {
//                    size = 2;
//                }
//                else if(i<n && s.charAt(i) == s.charAt(i - 1)){
//                    size = 2;
//                }else{
//                    size++;
//                }
//
//            } else {
//                size++;
//                count = 1;
//            }
//
//            maxLength = Math.max(maxLength, size);
//        }
