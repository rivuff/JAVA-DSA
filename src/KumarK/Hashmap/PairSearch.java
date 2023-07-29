package KumarK.Hashmap;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class PairSearch {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int t = scr.nextInt();

        while (t-->0){
            int n = scr.nextInt();
            int[] arr = new int[n+1];
            HashMap<Integer, Integer> map =new HashMap<>();

            for(int i = 1;i<=n;i++){
                arr[i] = scr.nextInt();
            }


            int i = 1;
            int count = 0;
            while(i<=n){
                int rhs= arr[arr[arr[i]]];

                int g = map.getOrDefault(rhs,0);

                count+=g;

                int lhs = arr[arr[arr[i]]];
                map.put(lhs, map.getOrDefault(lhs,0)+1);
                i++;
            }

            System.out.println(count);

        }
    }

}
