package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class BestBubble {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }

        int[] arr2 = Arrays.copyOf(arr, n);
        int count1= ascSort(arr, n);
        int count2 = descSort(arr2, n);

        System.out.println(Math.min(count1, count2));
    }

    static int ascSort(int arr[], int n)
    {
        int temp;
        int count =0;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    swapped = true;
                }
            }

            if(swapped == false){
                break;
            }
        }


        return count;
    }

    static int descSort(int arr[], int n)
    {
        int temp;
        int count =0;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    swapped = true;
                }
            }

            if(swapped == false){
                break;
            }
        }

        return count;
    }
}
