package leetcode;

import java.util.Stack;

public class simplifyPath {
    public static void main(String[] args) {
        String st = "/../";
        System.out.println(solve(st));
    }

    static String solve(String path){
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();

        String[] arr = path.split("/");
        int n = arr.length;

        for(int i = 0;i<n;i++){
            if(!st.isEmpty() && arr[i].equals("..")) st.pop();
            else if(!arr[i].equals("") && !arr[i].equals(".") && !arr[i].equals("..")){
                st.push(arr[i]);
            }
        }

        if(st.isEmpty()) return "/";
        while(!st.isEmpty()){
            sb.insert(0,st.pop()).insert(0,"/");
        }
        return sb.toString();
    }
}
