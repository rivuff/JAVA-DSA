package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class mostPopulerVideoCreator {
    public static void main(String[] args) {
        String[] creators = {"alice","alice","alice"};
        String[] ids = {"a","b","c"};
        int[] views = {1,2,2};

        System.out.println(mostPopularCreator(creators,ids,views));
    }

    public static List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        HashMap<String, Integer> map = new HashMap<>();
        int n = creators.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(creators[i])){
                map.put(creators[i],map.get(creators[i])+views[i]);
            }
            else map.put(creators[i], views[i]);
        }

        int max = 0;
        List<List<String>> outer = new ArrayList<>();

        for (String str : map.keySet()) {
            max = Math.max(map.get(str),max);
        }
        List<String> list = new ArrayList<>();

        for (String st : map.keySet()){
            if (map.get(st)==max){
                list.add(st);
            }
        }
       for (int j = 0;j<list.size();j++){
           String ch = list.get(j);
           List<String> res = new ArrayList<>();
           int c = 0;
           String result = "zzzzzz";
           int maxval = 0;
           for (int i = 0; i < n; i++) {
               if (creators[i]==ch ) {
                    if (views[i]>maxval ){
                        maxval = views[i];
                    }
               }
           }
           for (int i = 0; i < n; i++) {
               if (creators[i]==ch && views[i]==maxval ){
                   int a= result.compareTo(ids[i]);
                   if(a>0){
                       result = ids[i];
                       c = i;
                   }
               }

           }

           res.add(creators[c]);
           res.add(result);

           outer.add(res);
       }
       return outer;

    }
}
