package leetcode;

import java.util.Arrays;

public class DetectChar {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2,43};
        qs(arr, 0, 5);

        System.out.println(Arrays.toString(arr));
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }

            while (arr[j] > pivot && j > low) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }

    static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int PTIndex = partition(arr, low, high);
            qs(arr, low, PTIndex - 1);
            qs(arr, PTIndex + 1, high);
        }
    }
}
