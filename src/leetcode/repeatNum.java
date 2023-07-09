package leetcode;

import java.util.Arrays;

public class repeatNum {
    public static void main(String[] args) {
        int[] A = {3,1,2,5,3};
        int[] arr = repeatedNumber(A);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] repeatedNumber(int[] A) {
        int n = A.length;
        int[] a = new int[n];
        Arrays.fill(a, 0);

        for(int i =0;i<n;i++){
            a[A[i]-1]++;
        }

        int [] arr = new int[2];


        for(int i =0;i<n;i++){
            if(a[i]==2){
                arr[0] = i+1;
            }

            if(a[i]==0){
                arr[1] = i+1;
            }
        }

        return arr;
    }
}
