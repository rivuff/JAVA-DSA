package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class minimumDetails {
    public static void main(String[] args) {
        String s = "bbcebab";
        System.out.println(minDeletions(s));
    }

    public static int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();
        for(int i =0;i<n;i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }


        int[] arr = new int[map.size()];
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for(int num : map.values()){
            set.add(num);
            arr[k] = num;
            k++;
        }

        Arrays.sort(arr);
        int count = 1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                int num = arr[i];
                num--;

                while(set.contains(num)){
                    num--;
                    count++;
                }
                set.add(num);
            }
        }

        return count;

    }
}
