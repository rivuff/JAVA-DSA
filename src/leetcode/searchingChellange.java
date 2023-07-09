package leetcode;

import java.util.Stack;

public class searchingChellange {
    public static void main(String[] args) {
        String str= "((fads)(fss)))";
        System.out.println(search(str));
    }

    public static String search(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<n;i++){
            if(str.charAt(i)=='('){
                st.push('(');
            }else if(str.charAt(i)==')'){
                if(st.isEmpty()){
                    return "0";
                }
                else if(st.peek()!='('){
                    return "0";
                }

                st.pop();
            }
        }

        if(st.isEmpty()){
            return "1";
        }
        return "0";
    }

}
