package CompanyBased.Microsoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class conbinationSum {
    public static void main(String[] args) {
        int k =6;
        int n = 35;

        Set<List<Integer>> list = new HashSet<>();

        backtracking(list,n,k,new HashSet<>());

        System.out.println(new ArrayList<>(list));
    }

    public static void backtracking(Set<List<Integer>> list, int target, int n, HashSet<Integer> set){
        if (n==0){
            if (target==0){
                list.add(new ArrayList<>(set));
            }
            else return;
        }
        if (target==0){
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (!set.contains(i)){
                set.add(i);
                backtracking(list,target-i,n-1,set);
                set.remove(i);
            }
        }
    }
}
