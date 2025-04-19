package TwoPointer;

import java.util.Stack;

public class conseccutiveInteger {

    Stack<Integer> st;
    int val;
    public void DataStream(int value, int k) {
        val =k;
        st = new Stack<>();
        st.push(value);
    }

    public boolean consec(int num) {
        st.push(num);
        if(st.size()<val){
            return false;
        }

        Stack<Integer> copy = st;
        int t = val;
        while(t-->0){
            if(st.pop()!=val){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }


}
