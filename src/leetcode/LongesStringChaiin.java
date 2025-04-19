package leetcode;

import java.util.HashSet;

public class LongesStringChaiin {
    public static void main(String[] args) {
        String[] words = {"bdca","bda","ca","dca","a"};

        System.out.println(longestStrChain(words));
    }

    public static int longestStrChain(String[] words) {
        HashSet<String> set = new HashSet<>();
        int n = words.length;
        for(String str : words){
            set.add(str);
        }

        int maxCount = 0;
        for(int i =0;i<n;i++){

            StringBuilder str = new StringBuilder(words[i]);
            int j = str.length()-1;
            int count= 0;
            while(true){
                if(j==-1){
                    break;
                }
                StringBuilder cln = new StringBuilder(str);
                StringBuilder s = cln.deleteCharAt(j);

                if(set.contains(s.toString())){
                    str = s;
                    count++;
                    j = str.length()-1;
                }else{
                    j--;
                }

            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount+1;
    }
}
