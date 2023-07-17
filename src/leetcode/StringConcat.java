package leetcode;

import java.util.HashMap;

public class StringConcat {
    public static void main(String[] args) {
        String[] nums = {"1", "1", "1"};
        String target = "11";

        System.out.println(numOfPairs(nums, target));
    }

    public static int numOfPairs(String[] nums, String target) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(String str : nums){
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        for(String str : nums){
            for(String str1 : map.keySet()){
                String ans = str + str1;

                if(ans.equals(target)){
                    if(str == str1){
                        count+= map.get(str1) -1;
                    }
                    else{
                        count += map.get(str1);
                    }
                }
            }
        }

        return count;

    }
}
