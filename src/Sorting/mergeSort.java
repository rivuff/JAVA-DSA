package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,6};

        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }

        int mid = (start+end)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end){
        ArrayList<Integer> list = new ArrayList<>();
        int left = start;
        int right = mid+1;

        while(left<=mid && right<=end){
            if(arr[left]<arr[right]){
                list.add(arr[left]);
                left++;
            }else {
                list.add(arr[right]);
                right++;
            }
        }

        while (left<=mid){
            list.add(arr[left]);
            left++;
        }

        while (right<=end){
            list.add(arr[right]);
            right++;
        }

        for(int i = start;i<=end;i++){
            arr[i] = list.get(i-start);
        }
    }


}
