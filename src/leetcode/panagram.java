package leetcode;

import java.util.HashSet;

public class panagram {
    public static void main(String[] args) {
        String s = "s";
        System.out.println(solve(s));
    }

    static boolean solve(String sentence){

        if (sentence.length()<26){
            return false;
        }
        HashSet<Character> set = new HashSet<>();

        for(char c='a';c<='z';c++){
            set.add(c);
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (set.contains(sentence.charAt(i))){
                set.remove(sentence.charAt(i));
            }
        }
        if (set.isEmpty()){
            return true;
        }

        return false;
    }
}
