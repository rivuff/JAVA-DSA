package KumarK.Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dictoionary {
    public static void main(String[] args) {
        String str ="cat batman rat cat matter cat matter";
        String[] arr = solve(str);
        System.out.println(Arrays.toString(arr));
    }

    static String[] solve(String str){
        HashMap<String,Integer> map = new HashMap<>();

        String[] strArr = str.split(" ");
        int n  = strArr.length;

        for(int i =0;i<n;i++){
            map.put(strArr[i], map.getOrDefault(strArr[i], 0)+1);
        }

        List<String> list = new ArrayList<>();

        for(String s: map.keySet() ){
            if(map.get(s)>1){
                list.add(s);
            }
        }

        int m = list.size();
        String[] arr = new String[m];
        for (int i =0;i<m;i++){
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);

        return arr;
    }
}
