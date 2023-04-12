package leetcode;

public class firstOccurance {
    public static void main(String[] args) {
        String str = "leetcode";
        String str1 = "eet";

        System.out.println(strStr(str,str1));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i = 0;i<n-m+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(needle.equals(haystack.substring(i,i+m))){
                    return i;
                }
            }
        }
        return -1;
    }
}
