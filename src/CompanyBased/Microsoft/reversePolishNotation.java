package CompanyBased.Microsoft;

import java.util.Stack;

public class reversePolishNotation {
    public static void main(String[] args) {
        String[] token = {"2","1","+","3","*"};
        System.out.println(evalRPN(token));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length;

        for(int i=0;i<n;i++){
            if(tokens[i]=="+"){
                int a =st.pop();
                int b = st.pop();

                int x = a+b;

                st.push(x);
            }
            else if(tokens[i]=="-"){
                int a =st.pop();
                int b = st.pop();

                int x = b-a;
                st.push(x);
            }
            else if(tokens[i]=="/"){
                int a =st.pop();
                int b = st.pop();

                int x = b/a;
                st.push(x);
            }
            else if(tokens[i]=="*"){
                int a =st.pop();
                int b = st.pop();

                int x = b*a;
                st.push(x);
            }
            else{
                int a = Integer.parseInt(tokens[i]);
                st.push(a);
            }
        }

        return st.pop();
    }
}
