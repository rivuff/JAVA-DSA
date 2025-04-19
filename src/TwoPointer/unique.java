package TwoPointer;

import java.util.HashMap;

public class unique {
    public static void main(String[] args) {
        String a = "aabacbebebe";
        int k=3;

        System.out.println(longestkSubstr(a, k));

    }

    public static int longestkSubstr(String s, int k) {
        // code here
        int n = s.length();

        HashMap<Character, Integer> freq = new HashMap<>();

        int i =0;
        int j = 0;

        int count = 0;
        int maxCount = -1;
        while(j < n ){

            if(freq.containsKey(s.charAt(j))){
                freq.put(s.charAt(j), freq.get(s.charAt(j))+1);
                count++;
                if(freq.size()==k){
                    maxCount = Math.max(count, maxCount);
                }
            }else{
                freq.put(s.charAt(j), 1);

                if(freq.size()==k){
                    maxCount = Math.max(count, maxCount);
                }

                while(freq.size()>k){
                    freq.put(s.charAt(i), freq.get(s.charAt(i))-1);

                    if(freq.get(s.charAt(i))==0){
                        freq.remove(s.charAt(i));
                    }
                    count--;
                    i++;
                }

                count++;

            }
            j++;
        }

        return maxCount;
    }
}
