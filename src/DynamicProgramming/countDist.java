package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class countDist {
    public static void main(String[] args) {
        int n = 7;
        int k =4;
        int[] arr = {1,2,1,3,4,2,3};

        ArrayList<Integer> list = new ArrayList<>();
        list = countDistinct(arr,n,k);
        System.out.println(list);
    }

    static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<k;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }

        list.add(map.size());

        for(int i=k;i<A.length;i++){
            if(map.get(A[i-k])==1){
                map.remove(A[i-k]);
            }
            else{
                map.put(A[i-k],map.get(A[i-k])-1);
            }

            map.put(A[i],map.getOrDefault(A[i],0)+1);

            list.add(map.size());
        }

        return list;

    }

}
