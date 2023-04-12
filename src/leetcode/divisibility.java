package leetcode;

import java.util.Arrays;

public class divisibility {
    public static void main(String[] args) {
        String word = "4868438856666666";
        int[] arr = divisibilityArray(word,6);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] divisibilityArray(String word, int m) {
        char[] words = word.toCharArray();
        int n = words.length;
        int[] ans = new int[n];
        double sum = 0;
        double a = 1e9;
        for(int i =0;i<n;i++){
            sum = sum*10 + Character.getNumericValue(words[i]);
            sum = sum%a;
            if(sum%m==0){
                ans[i]=1;
            }
            else ans[i]=0;
        }
        return ans;
    }
}
