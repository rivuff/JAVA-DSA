package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class MinDlt {
    public static void main(String[] args) {
        String str = "bbcebab";

        System.out.println(minDeletions(str));
    }

    public static int minDeletions(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n = s.length();
        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int dlt = 0;
        while(i<n){
            char ch = arr[i];
            int count = 1;
            int j = i+1;
            while(j<n && arr[j]==ch){
                count++;
                j++;
            }

            if(set.contains(count)){
                while(set.contains(count)){
                    if(count==0){
                        break;
                    }
                    count--;
                    dlt++;
                }
                set.add(count);
            }else{
                set.add(count);
            }
            i = j;
        }

        return dlt;
    }
}
