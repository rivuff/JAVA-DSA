package TwoPointer;

import java.util.HashMap;
import java.util.HashSet;

public class uniqueness {
    public static void main(String[] args) {
        int[] arr = {1,5,2,1,3,5};
        System.out.println(solve(arr));
    }

    static int solve(int[] arr){

        int n = arr.length;
        int totalSubArr = n*(n+1)/2;

        int[] c = new int[n];


        int mean = 0;

        if(totalSubArr%2==0){
            mean = totalSubArr/2;
        }else{
            mean = totalSubArr/2+1;
        }

        c[0] = 0;
        int i =1;
        while (i<=n){
            c[i] = c[i-1] + unique(arr, i);

            if(c[i]>mean){
                return i;
            }
            i++;
        }

        return -1;
    }

   static int unique(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int i = 0;
        int j = 0;

        int r = 0;
        while (j<n){

            if(map.size()>k){
                map.put(arr[i], map.get(arr[i])-1);

                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
            }else{
                int l = Math.abs(i-j)+1;
                r+=l;

                if(j<n){
                    map.put(arr[j], map.getOrDefault(arr[j],0)+1);
                }

                j++;

            }
        }

        return r;
   }
}
