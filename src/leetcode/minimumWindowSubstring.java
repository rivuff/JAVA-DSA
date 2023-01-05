package leetcode;

import java.util.HashMap;

public class minimumWindowSubstring {
    public static void main(String[] args) {
        String str ="ADOBECODEBANC";
        String T = "ABC";
        System.out.println(minWindow(str,T));
    }

    static String minWindow(String s, String t){
        int [] freq = new int[128];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

        int start = 0,minStart=0, minsLen =Integer.MAX_VALUE, end =0, counter = t.length();

        while (end<s.length()){
            char endS = s.charAt(end);

            if(freq[endS]>0){
                counter--;
            }

            freq[endS]--;
            end++;

            while (counter==0) {
                if (minsLen > end - start) {
                    minsLen = end - start;
                    minStart = start;
                }
            }

                char startS = s.charAt(start);
                freq[startS]++;
                if (freq[startS]>0){
                    counter++;

                }
            start++;
            }

        return minsLen==Integer.MAX_VALUE?"": s.substring(minStart,minStart+minsLen);
    }
}
