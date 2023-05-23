package leetcode;

import java.util.ArrayList;
import java.util.List;

public class clubQueue {
    public static void main(String[] args) {
        int[] arr = {25,35,23,11,13,28};
        int k = 4;

        System.out.println(solve(arr, k));
    }

    public static List<Integer> solve(int[] arr, int limit){

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
        }

        int ind =0;
        while (ind<list.size() && limit>0){
            if(list.get(ind)<list.get(ind+1)){
                list.remove(ind);
                limit--;
            }
            else ind++;
        }
        return list;
    }
}
