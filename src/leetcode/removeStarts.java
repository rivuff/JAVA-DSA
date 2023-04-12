package leetcode;

import java.util.Stack;

public class removeStarts {
    public static void main(String[] args) {
        String s = "lee**cdoe";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {

        int n = s.length();

        Stack<Character> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else st.push(s.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}
