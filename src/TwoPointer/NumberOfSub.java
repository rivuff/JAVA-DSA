package TwoPointer;

import java.util.HashMap;

public class NumberOfSub {
    public static void main(String[] args) {
        String s  ="abcca";
        int k = 3;

        System.out.println(solve(s,k));
    }

    public static int solve(String s, int k){
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        while (j<n){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            while(map.size()>= k){
                count+= n-j;

                map.put(s.charAt(i), map.get(s.charAt(i))-1);

                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }

        return count;
    }
}
