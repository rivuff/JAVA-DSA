package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class splitStr {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("$easy$");
        words.add("$problem$");

        System.out.println(splitWordsBySeparator(words, '$'));
    }


    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        int n = words.size();
        List<String> str = new ArrayList<>();
        String sep = "["+separator+"]";
        for(int i =0;i<n;i++){
            String string= words.get(i);

            String[] arrOfStr = string.split(sep);

            for(String s : arrOfStr){
                str.add(s);
            }
        }

        str.removeAll(Arrays.asList("", null));


        return str;
    }
}
