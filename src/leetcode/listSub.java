package leetcode;

import java.util.ArrayList;
import java.util.List;

public class listSub {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        solve(0, arr, 3, new ArrayList<>());
    }

    static void solve(int ind, int[] arr, int n, List<Integer> list){
        if(ind==n){
            System.out.println(list);
            return;
        }

        list.add(arr[ind]);
        solve(ind+1,arr, n, list );
        list.remove(list.size()-1);
        solve(ind+1, arr, n, list);
    }
}
