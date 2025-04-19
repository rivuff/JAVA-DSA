package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs ={""};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, List<Integer>> map = new HashMap<>();

        for(int i =0;i<n;i++){
            String str = strs[i];

            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            str = String.valueOf(ch);
            if(str.isEmpty()){
                str = "";
            }
            List<Integer> list;
            if(map.containsKey(str)){
                list = map.get(str);
            }else{
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(str, list);
        }

        List<List<String>> ans= new ArrayList<>();

        for(List<Integer> li: map.values()){
            List<String> st = new ArrayList<>();
            for(int i =0;i<li.size();i++){
                st.add(strs[li.get(i)]);
            }
            ans.add(st);
        }

        return ans;
    }
}
