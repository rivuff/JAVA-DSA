package leetcode;

import java.util.HashSet;

public class numberOfDistinct {
    public static void main(String[] args) {

    }

    static int reverse(int a){
        String s = String.valueOf(a);
        StringBuilder str = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            str.append(s.charAt(i));
        }

        int ans = Integer.valueOf(str.toString());
        return ans;
    }
}
