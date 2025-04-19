package KumarK.DynamicProgramming;

import java.util.Scanner;

public class LongestSubstringWithoutContiguastwo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
       // String str = scr.next();
        String str = "aabbaabababa";
        char[] arr = str.toCharArray();
        int n = arr.length;

        int i = 0;
        int maxCount = 0;
        int count = 0;
        String s = "";
        String temps = "";
        while (i<n){
            if(i<n-2){
                if(arr[i]==arr[i+1] && arr[i]==arr[i+2]){
                    count+=2;
                    temps = temps+arr[i] + arr[i+1];
                    if(count>maxCount) {
                        maxCount = count;
                        s = temps;
                    }

                    count=0;
                    i++;
                    continue;
                }
            }

            count++;
            temps = temps+ arr[i];

            if(count>maxCount){
                maxCount=count;
                s = temps;
            }
            i++;
        }


        System.out.println(s);
    }


}
