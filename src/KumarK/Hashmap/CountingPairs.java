package KumarK.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountingPairs {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        int[] member = {1,1,1,2};

        System.out.println(solve(k,member));
    }

    static int solve(int k, int[] arr){
        HashMap<Integer,Integer> set = new HashMap<>();
        HashSet<Integer> pairs= new HashSet<>();

        for(int num : arr){
            set.put(num, set.getOrDefault(num, 0)+1);
        }

        for(int num : arr){
            if(k==0){
                if(set.get(num)>1){
                    pairs.add(num);
                }
            }
            if(set.containsKey(num+k)){
               pairs.add(num);
            }
        }

        return pairs.size();
    }
}
