package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class removeOuterMost {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        String str = "";

        int n = s.length();
        Queue<Character> q = new LinkedList<>();
        int count = 0;
        for(int i = 0;i<n;i++){
            if(q.isEmpty()){
                q.add(s.charAt(i));
            }
            else if( q.peek()==')' ){
                q.poll();
                q.add(s.charAt(i));
            }
            else{
                if(count==0 && s.charAt(i)==')'){
                    q.poll();
                    q.add(')');
                }
                else{
                    str += s.charAt(i);
                    if(s.charAt(i)=='('){
                        count++;
                    }
                    else count--;
                }
            }

        }

        return str;

    }
}
