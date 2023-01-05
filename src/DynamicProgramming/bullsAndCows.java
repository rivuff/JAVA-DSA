package DynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bullsAndCows {
    public static void main(String[] args) {
        String str = "1807";
        String str2 = "7810";

        System.out.println(getHint(str,str2));
    }

    public static String getHint(String secret, String guess) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        int n = secret.length();
        int count = 0;
        int count2 =0;

        for(int i=0;i<n;i++){
            if(secret.charAt(i)==guess.charAt(i)){
                count++;
            }
            else {
                str1.append(secret.charAt(i));
                str2.append(guess.charAt(i));
            }
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (int i = 0; i < str2.length(); i++) {
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }

        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()){
            char a = entry.getKey();
            int b = entry.getValue();

            if (map2.containsKey(a)){
                if (map2.get(a)>b){
                    count2+=b;
                }
                else count2+=map2.get(a);
            }
        }

        String str = count+"A"+count2+"B";
        return str;
    }
}
