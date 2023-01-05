package leetcode;

public class circular {
    public static void main(String[] args) {
        String sentene ="Leetcode is cool";

        System.out.println(isCircularSentence(sentene));
    }

    public static boolean isCircularSentence(String sentence) {
        int n = sentence.length();

        if (sentence.charAt(0)!=sentence.charAt(n-1)){
            return false;
        }
        String[] str = null;
        str = sentence.split(" ");

        for (int i = 0; i < str.length-1; i++) {
            int s  = str[i].length();
            if (str[i].charAt(s-1)!=str[i+1].charAt(0)){
                return false;
            }
        }
        return true;
    }
}
