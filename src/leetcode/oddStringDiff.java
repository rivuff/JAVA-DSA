package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class oddStringDiff {
    public static void main(String[] args) {
//        String[] words = {"adc","wzy","abc"};
//
//
//        int n = words.length;
//        int m = words[0].length();
//
//        HashMap<int[], Pair> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            int[] arr = new int[m - 1];
//            for (int j = 1; j < m; j++) {
//                int sum = (words[i].charAt(j) - words[i].charAt(j - 1));
//                arr[j - 1] = sum;
//            }
//            System.out.println(Arrays.toString(arr));
//        }
    }

    public class Pair{
        int first;
        String second;
        public Pair(int first, String second){
            this.first = first;
            this.second = second;
        }
    }

    public String oddString() {
        String[] words = {"adc","wzy","abc"};

        int n = words.length;
        int m = words[0].length();

        HashMap<int[], Pair> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[m-1];
            for (int j = 1; j < m; j++) {
                int sum = (words[i].charAt(j) - words[i].charAt(j - 1));
                arr[j - 1] = sum;
            }
            if (map.containsKey(arr)){
                int a = map.get(arr).first+1;
                map.put(arr,new Pair(a, words[i]));
            }

            map.put(arr,new Pair(1,words[i]));

        }
        for(int[] ar : map.keySet()){
            if (map.get(ar).first==1){
                return map.get(ar).second;
            }
        }

        return "";

    }
}
