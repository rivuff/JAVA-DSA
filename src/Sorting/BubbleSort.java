package Sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,4,1,5};
        int n = arr.length;
        //bubble sort
//       for(int i = n-1;i>=0;i--){
//           for(int j =0;j<i-1;j++){
//               if(arr[j]>arr[j+1]){
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//               }
//           }
//       }
//
//        System.out.println(Arrays.toString(arr));

        //Selection sort

        for(int i =0;i<n;i++){
            int j = i;

            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
    }
}
