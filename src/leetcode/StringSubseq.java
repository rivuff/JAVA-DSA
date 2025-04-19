package leetcode;

import java.util.HashMap;

public class StringSubseq {
    public static void main(String[] args) {
        String str1 = "eao";
        String str2 = "ofa";

        System.out.println(solve(str1, str2));
    }

    public static boolean solve(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char[] arr  = new char[str1.length()];
        int n = arr1.length;
        int m = arr2.length;

        int i =0;
        int j =0;
        int k =0;
        while (k<n){
            if(arr1[k]=='z'){
                arr[k] = 'a';
            }
            else arr[k] = (char)(arr1[k]+1);
            k++;
        }

        while (i<m && j<n){

            if(i==m){
                return true;
            }
            if(arr2[i] == arr1[j]){
                i++;
                j++;
            }else if(arr2[i]==arr[j]){
                i++;
                j++;
            }
            else j++;

            if(j==n && i!=m){
                return false;
            }
        }

        return true;

    }
}
