package TwoPointer;

import java.util.Stack;

public class DataStream {

    Stack<Integer> st;
    int val;
    int time;
    public DataStream(int value, int k) {
        time =k;
        st = new Stack<>();
        val = value;
    }

    public boolean consec(int num) {
        st.push(num);
        if (st.size() < time) {
            return false;
        }

        Stack<Integer> copy = new Stack<>();
        copy.addAll(st);
        int t = time;
        while (t> 0) {
            int last = copy.pop();
            if (last != val) {
                return false;
            }
            t--;
        }

        return true;

    }

    public static void main(String[] args) {
        DataStream dt = new DataStream(4,3);
        System.out.println(dt.consec(4));
        System.out.println(dt.consec(4));
        System.out.println(dt.consec(4));System.out.println(dt.consec(3));
    }
}
