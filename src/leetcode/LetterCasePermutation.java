package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {

    }

    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        solve(s,0,new String(""), list);
        return list;
    }

    public void solve(String s, int ind, String ans, List<String> list){
        if(ind==s.length()){
            list.add(ans);
            return;
        }

        char ch = s.charAt(ind);

        if(!Character.isDigit(ch)){
            if(Character.isUpperCase(ch)){
                solve(s,ind+1, ans + Character.toLowerCase(ch)+"",list);
            }
            else {
                solve(s,ind+1, ans + Character.toUpperCase(ch)+"",list);
            }
        }

        solve(s, ind+1, ans + ch+"",list);


    }
}
