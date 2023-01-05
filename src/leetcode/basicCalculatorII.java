package leetcode;

import java.util.Stack;

public class basicCalculatorII {
    public static void main(String[] args) {
        String s = "2 + 3 - 5";
        System.out.println(solve(s));
    }

    static int solve(String s){
        Stack<Integer> stack = new Stack<>();
        int curNum = 0;
        char op = '+';

        for (int i = 0; i < s.length(); i++) {

            char chr = s.charAt(i);
            if (Character.isDigit(chr)) curNum = curNum * 10 + (chr-'0');

            if (!Character.isDigit(chr) && chr != ' ' || s.length()-1 == i) {
                if (op == '-') stack.push(-curNum);
                else if (op == '+') stack.push(curNum);
                else if (op == '*') stack.push(stack.pop()*curNum);
                else if (op == '/') stack.push(stack.pop()/curNum);

                op = chr;
                curNum = 0;
            }
        }

        int res = 0;
        while (!stack.empty()) res += stack.pop();
        return res;
    }
}
