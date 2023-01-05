package leetcode;

import java.util.*;

public class sortFreq {
    public static void main(String[] args) {
        String str = "tree";
        String s = frequencySort(str);
        System.out.println(s);
    }

    public static class Pair{
        int val;
        char c;
        public Pair(char c, int val){
            this.val = val;
            this.c = c;
        }
    }

    public static String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();

        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)-> b.val-a.val);

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            q.add(pair);
        }

        StringBuilder sb = new StringBuilder("");

        while(!q.isEmpty()){
            Pair pair = q.remove();
            int count = pair.val;
            char ch =pair.c;

            while (count-->0){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
