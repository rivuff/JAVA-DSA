package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class stringChellange {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.next();

        String[] splited = str.split(" ");

        int n = splited.length;
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            HashMap<Character, Integer> map = new HashMap<>();
            int j = 0;
            int max = 0;
            while(j<splited[i].length()){
                map.put(splited[i].charAt(j), map.getOrDefault(splited[i].charAt(j),0)+1);
                int x = map.get(splited[i].charAt(j));
                max= Math.max(max, x);
                j++;
            }

            arr[i] = max;
        }

        int ans = -1;
        int max = -1;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                ans = i;
            }
        }

        if(max==1){
            System.out.println(-1);
        }else{
            System.out.println(splited[ans]);
        }

    }


}
