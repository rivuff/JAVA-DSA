package leetcode;

import java.util.Stack;

public class maxNestDepth {
    public static void main(String[] args) {
        String s = "1+(2*3)/(2-1)";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int upcount=0;

        int ans=0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                upcount++;
            }
            ans=Math.max(ans,upcount);
            if(s.charAt(i)==')'){
                upcount--;
            }

        }
        return ans;
    }
}
