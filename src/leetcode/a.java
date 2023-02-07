package leetcode;

import java.util.HashMap;

public class a {
    public static void main(String[] args) {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(isAlienSorted(words,order));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0;i<26;i++){
            map.put(order.charAt(i),i);
        }

        int n = words.length;
        int m = 0;
        char[][] arr = new char[n][26];

        for(int i=0;i<n;i++){
            arr[i]= words[i].toCharArray();
            m = Math.max(m,words[i].length());
        }


        for(int i=0;i<m;i++){
            for(int j =0;j<n-1;j++){
                if(j<words[j].length() && j<words[j+1].length()){
                    if(map.get(arr[j][i])<map.get(arr[j+1][i])){
                        return true;
                    }
                    else if(map.get(arr[j][i])>map.get(arr[j+1][i])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
