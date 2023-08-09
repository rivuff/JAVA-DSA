package leetcode;

import java.util.ArrayList;
import java.util.List;

public class wordBreak {
    public static void main(String[] args) {
        String s = "catsandog";
        List<String> list= new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");

        System.out.println(solve(s, list));
    }

    static boolean solve(String s, List<String> wordDict){
        for(int i = 0;i<wordDict.size();i++){
            if(!s.contains(wordDict.get(i))){
                return false;
            }else {
                s = s.replace(wordDict.get(i),"");
            }
        }
        return true;
    }
}
