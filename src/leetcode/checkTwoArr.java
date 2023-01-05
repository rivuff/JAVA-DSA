package leetcode;

public class checkTwoArr {
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length;
        int m = word2.length;
        String str1 = new String();
        String str2 = new String();
        str1 = "";
        str2 = "";

        for (int i = 0; i < n; i++) {
            str1 += word1[i];
        }

        for (int i = 0; i < m; i++) {
            str2 += word2[i];
        }

        return str2.equals(str1);
    }
}
