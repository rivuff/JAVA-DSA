package leetcode;

import java.util.ArrayList;

public class reversePairs {
    public static void main(String[] args) {
        int[] arr = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int low = 0;
        int high = arr.length-1;

        System.out.println(mergeSort(arr, low, high));
    }

    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }


        while (left<=mid){
            list.add(arr[left]);
            left++;
        }

        while (right<=high){
            list.add(arr[right]);
            right++;
        }

        for(int i = low;i<=high;i++){
            arr[i] = list.get(i-low);
        }
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += countPairs(arr, low, mid, high); //Modification
        merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }



}
