package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class countPairs {
    public static void main(String[] args) {
        String[] arr ={"aba","aabb","abcd","bac","aabc"};
        System.out.println(solve(arr));
    }

    static int solve(String[] words){
        int n = words.length;
        HashSet[] arr = new HashSet[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int m = words[i].length();
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < m; j++) {
                set.add(words[i].charAt(j));
            }
            arr[i]=set;
        }

        HashMap<HashSet,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for (int x: map.values()){
            x--;
            while (x!=0){
                count+=x;
                x--;
            }

        }

        return count;

    }
}
