package codevita;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class GenerateNewWord {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String lang = scr.nextLine(); //"palskdjfieuryt93516247oh"; scr.next();
        String conv = scr.nextLine(); //"Philacodist 2021";//scr.next();

        System.out.print(solve(lang,conv));
    }

    static String solve(String lang, String conv){
        int n=lang.length();
        HashSet<Character> set = new HashSet<>();

        conv = conv.toLowerCase();
        String langLo = lang.toLowerCase();
        for(int i =0;i<n;i++){
            if(set.contains(lang.charAt(i))){
                return new String("New Language Error");
            }else {
                set.add(lang.charAt(i));
            }
        }


        String[] strArr = conv.split(" " );

        String answer="";

        for (int i =0;i<strArr.length;i++){
            HashMap<Character, Integer> map = new HashMap<>();

            for(int j =0;j<strArr[i].length();j++){
                map.put(strArr[i].charAt(j), map.getOrDefault(strArr[i].charAt(j),0)+1);
            }
            int j = 0;
            while (j<lang.length()){
                String str = langLo.charAt(j) + "";

                if(strArr[i].contains(str)){
                    int m = map.get(langLo.charAt(j) );
                    while (m-->0){
                        answer += lang.charAt(j);
                    }
                }
                j++;
            }
            if(i!=strArr.length-1){
                answer+= " ";
            }
        }
        return answer;
    }
}
