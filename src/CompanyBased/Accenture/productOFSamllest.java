package CompanyBased.Accenture;

import java.util.Scanner;

public class productOFSamllest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }

        int sum = scr.nextInt();

        System.out.println(solve(arr, sum));
    }

    static int solve(int [] arr, int sum){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int second = min;
        for(int i =0;i<n;i++){
            if(arr[i]<min){
                second = min;
                min =arr[i];
            }else if(arr[i]<second){
                second  = arr[i];
            }
        }

        if(min+second<sum){
            return min*second;
        }

        return 0;
    }
}
