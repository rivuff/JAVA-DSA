package DailyChellange;

import java.util.ArrayList;
import java.util.List;

public class anagram {
    public static void main(String[] args) {

    }

    static List<Integer> solve(String s, String p){
        List<Integer> ans = new ArrayList<>();
        int[] arr1 = new int[26];
        int unMatchingChar = p.length();
        int n = s.length();
        int m = p.length();

        if(m>n){
            return ans;
        }
        for(int i=0;i<m;i++){
            arr1[p.charAt(i)-'a']++;
        }

        int start =0;
        int end =0;

        for(;end<p.length();end++){
            int index =s.charAt(end)-'a';
            if(arr1[index]>0){
                unMatchingChar--;
            }
            arr1[index]--;
        }

        if(unMatchingChar==0){
            ans.add(start);
        }

        for(;end<s.length();){
            int indexStart =s.charAt(end)-'a';

            if(arr1[indexStart]>=0){
                unMatchingChar++;
            }

            arr1[indexStart]++;
            start++;

            int indexEnd = s.charAt(end)-'a';

            if(arr1[indexEnd]>0){
                unMatchingChar--;
            }

            if (unMatchingChar==0){
                ans.add(start);
            }
            end++;
        }
        return ans;
    }
}
