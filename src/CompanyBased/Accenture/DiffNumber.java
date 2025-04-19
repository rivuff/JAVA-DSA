package CompanyBased.Accenture;

import java.util.Scanner;

public class DiffNumber {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scr.nextInt();
        }

        int num = scr.nextInt();
        int diff= scr.nextInt();

        System.out.println(findCount(arr, num, diff));
    }

    public static int findCount(int[] arr, int num, int diff){

        int count =0;

        for(int i =0;i<arr.length;i++){
            if(Math.abs(num- arr[i])<=diff){
                count++;
            }
        }

        return count;
    }
}
