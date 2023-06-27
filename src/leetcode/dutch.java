package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class dutch {
    public static void main(String[] args) {
        int[] a = {0,2,1,2,0};
       sort012(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void sort012(int a[], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        int low = 0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(a[mid]==0){
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;

                mid++;
                low++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else if(a[mid]==2){
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }

    }

    public static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
