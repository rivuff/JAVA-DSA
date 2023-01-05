package codevita;

import java.util.HashMap;
import java.util.Scanner;

public class stringPair {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scr.nextInt();
        }

        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
        "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen","nineteen","twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty","ninety", "hundred"};

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]<=20){
                for (int j = 0; j < num[i].length(); j++) {
                    if (num[i].charAt(j)=='a'||num[i].charAt(j)=='e'||num[i].charAt(j)=='i'||num[i].charAt(j)=='o'||num[i].charAt(j)=='u'){
                        count+=1;
                    }
                }
            }
            else if (arr[i]>20 && arr[i]<100){
                int a = arr[i]/10;
                int b = arr[i]%10;
                int x = 19+a;
                for (int j = 0; j <num[x].length(); j++) {
                    if (num[x].charAt(j)=='a'||num[x].charAt(j)=='e'||num[x].charAt(j)=='i'||num[x].charAt(j)=='o'||num[x].charAt(j)=='u'){
                        count+=1;
                    }
                }

                for (int j = 0; j < num[b].length(); j++) {
                    if (num[b].charAt(j)=='a'||num[b].charAt(j)=='e'||num[b].charAt(j)=='i'||num[b].charAt(j)=='o'||num[b].charAt(j)=='u'){
                        count+=1;
                    }
                }
            }
            else if (arr[i]==100){
                for (int j = 0; j < num[29].length(); j++) {
                    if (num[29].charAt(j)=='a'||num[29].charAt(j)=='e'||num[29].charAt(j)=='i'||num[29].charAt(j)=='o'||num[29].charAt(j)=='u'){
                        count+=1;
                    }
                }
            }
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        
    }

}
