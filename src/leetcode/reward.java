package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class reward {
    public static void main(String[] args) {
        String[] pos = {"smart","brilliant","studious"};
        String[] neg = {"not"};
        String[] report ={"this student is studious","the student is smart"};
        int[] id = {2,1};
        int k = 2;



    }

    static class Pair{
        int a;
        int b;
        Pair(int a, int b){
            this.a = a;
            this.b=b;
        }
    }
    public static void topStudents(String[] positive, String[] negative, String[] report, int[] id, int k) {
        Set<String> pos =new HashSet<>();
        Set<String> neg = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int s = report.length;
        int[] arr = new int[s]; 
        int n = positive.length;
        int m = negative.length;

        for(int i =0;i<n;i++){
            pos.add(positive[i]);
        }

        for(int i = 0;i<m;i++){
            neg.add(negative[i]);
        }

        for (int i = 0; i <s; i++) {

            int len = report[i].length();
            int count=0;

            for (int j = 0; j < len; j++) {
                if (pos.contains(report[i].charAt(j))){
                    count = count+3;
                }
                if (neg.contains(report[i].charAt(j))){
                    count = count-1;
                }
            }
            arr[i]=count;
        }

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < s; i++) {
            map.put(arr[i],i);
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            list.add(id[entry.getValue()]);
        }

        Arrays.sort(arr);


    }
}
