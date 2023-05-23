package leetcode;

import java.util.Stack;

public class validateStackSeq {
    public static void main(String[] args) {
        int[] pushed = {0,2,1};
        int[] popped = {0,1,2};

        System.out.println(validateStackSequences(pushed,popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int n = pushed.length;
        int i = 0;
        int j = 0;
        while(pushed[i]!=popped[0]){
            st.push(pushed[i]);
            i++;
            if(i==n){
                return false;
            }
        }

        st.push(pushed[i]);
        st.pop();
        i++;
        for(j = 1;j<n;j++){
            if(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
            }
            else if(i<n && popped[j]==pushed[i]){
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
