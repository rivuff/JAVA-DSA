package CompanyBased.Amazon;

import java.util.HashMap;

public class OAFirst {
    public static void main(String[] args) {
        System.out.println(solve("mononfadfm", "advd"));
    }

    static int solve(String str, String k){
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i= 0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i =0;i<k.length();i++){
            map1.put(k.charAt(i), map1.getOrDefault(k.charAt(i), 0)+1);
        }
        boolean flag  = true;
        int count = Integer.MAX_VALUE;
            for(Character val : map1.keySet()){
                if(map.containsKey(val)){
                    count = Math.min(count, map.get(val)/map1.get(val));
                }else{
                    count = 0;
                    break;
                }
            }

        return count;

    }
}
