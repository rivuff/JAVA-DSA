package DailyChellange;

import java.util.HashSet;

public class greatestCommonDiv {
    public static void main(String[] args) {

    }

    public String gcdOfStrings(String str1, String str2) {
        HashSet<Character> set = new HashSet<>();

        int n = str1.length();
        int m = str2.length();

        for(int i=0;i<n;i++) {
            set.add(str1.charAt(i));
        }
        HashSet<Character> set1= new HashSet<>();
        String str = new String();
        for(int i=0; i< m;i++){
            if(set.contains(str2.charAt(i))){
                char a = str2.charAt(i);
                if(!set1.contains(a)){
                    str = str + str2.charAt(i);
                    set1.add(a);
                }
            }
        }

        return str;
    }
}
