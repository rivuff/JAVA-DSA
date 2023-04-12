package leetcode;

import java.util.Arrays;

public class mergeSortInplace {
    public static void main(String[] args) {
        int[] ar = {5,2,4,1,3};
        mergeSort(ar,0,ar.length);

        System.out.println(Arrays.toString(ar));
    }

    static void mergeSort(int[] arr, int s, int e){
        if(e-s== 1){
            return;
        }

        int mid = (s + e)/2;

         mergeSort(arr,s,mid);
         mergeSort(arr,mid,arr.length);

        merge(arr, 0, mid, arr.length);
    }

    static void merge(int[] arr, int s, int m , int e){
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else {
                mix[k]=arr[j];
                j++;
            }

            k++;
        }

        while (i< m){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l=0;l<mix.length;l++) {
            arr[s+l] = mix[l];
        }
    }
}
