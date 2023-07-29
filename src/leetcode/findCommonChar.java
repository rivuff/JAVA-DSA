package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findCommonChar {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> list = commonChars(words);
        System.out.println(list);
    }

    public static List<String> commonChars(String[] words) {

        int n = words.length;
        String str = words[0];

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        for(int i = 1;i< n;i++){
            String newStr = words[i];
            HashMap<Character, Integer> freq = new HashMap<>();

            for(int j = 0;j<newStr.length();j++){
                freq.put(newStr.charAt(j), freq.getOrDefault(newStr.charAt(j), 0)+1);
            }

            for(char key : map.keySet()){
                if(freq.containsKey(key)){
                    if(freq.get(key)>0){
                        map.put(key, Math.min(map.get(key), freq.get(key)));
                    }
                }
                else{
                    map.put(key, 0);
                }
            }
        }

        List<String> list = new ArrayList<>();

        for(char key : map.keySet()){
            int a = map.get(key);
            while(a-- > 0){
                list.add(""+key);
            }
        }

        return list;

    }
}
