package KumarK.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ArcesiumOA {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        //int n = scr.nextInt();


        String[] a = {"cdab", "dcba"}; //new String[n];
        String[] b = {"abcd", "abcd"}; //new String[n];
        int n = 2;
//        for(int i = 0;i<n;i++){
//            a[i] = scr.next();
//        }
//
//        for(int i =0;i<n;i++){
//            b[i] = scr.next();
//        }

        for(int i =0;i<n;i++){
            int len = a[i].length();

            HashSet<Character> set1 = new HashSet<>();
            HashSet<Character> set2 = new HashSet<>();
            int flag = 0;

            for(int j =0;j<len;j++){
                if(j%2==0){
                    set1.add(a[i].charAt(j));
                }else if(j%2==1){
                    set2.add(a[i].charAt(j));
                }
            }

            for(int j =0;j<len;j++){

                if(j%2==0){
                    if(!set1.contains(b[i].charAt(j))){
                        System.out.println("No");
                        flag=1;
                        break;
                    }
                }else{
                    if(!set2.contains(b[i].charAt(j))){
                        System.out.println("No");
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0){
                System.out.println("Yes");
            }

        }
    }

    public static boolean check(String x, String y) {
        int i = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        HashMap<Character, Integer> map3 = new HashMap<>();
        HashMap<Character, Integer> map4 = new HashMap<>();

        while (i < x.length()) {
            char g = x.charAt(i);

            if (i % 2 == 0) {
                map1.put(g, map1.getOrDefault(g, 0) + 1);
            } else {
                map2.put(g, map2.getOrDefault(g, 0) + 1);
            }

            i++;
        }

        i = 0;

        while (i < y.length()) {
            char g = y.charAt(i);

            if (i % 2 == 0) {
                map3.put(g, map3.getOrDefault(g, 0) + 1);
            } else {
                map4.put(g, map4.getOrDefault(g, 0) + 1);
            }

            i++;
        }

        return map1.equals(map3) && map2.equals(map4);
    }
}
