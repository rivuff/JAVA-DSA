package leetcode;

import java.util.HashSet;

public class longestPalindromeConcat {
    public static void main(String[] args) {
        String[] str = {"cl", "lc", "gg"};
        System.out.println(longestPalindrome(str));
    }

    public static int longestPalindrome(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(String str : words){
            String s ="";
            s += str.charAt(1);
            s+=str.charAt(0);
            if(set.contains(s)){
                set.remove(s);
                count+=4;
            }
            set.add(str);
        }

        for(String str : set){
            if(isPalindrome(str)){
                count+=2;
                break;
            }
        }

        return count;

    }

    public static boolean isPalindrome(String str){
        if(str.charAt(0)==str.charAt(1)){
            return true;
        }

        return false;
    }
}
