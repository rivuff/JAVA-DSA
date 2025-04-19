package CompanyBased.Accenture;

import java.util.Scanner;

public class LargeSmallSUm {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }


        int min = Integer.MAX_VALUE;
        int secondMin= min;
        for(int i =1;i<n;i+=2){
            if(arr[i]<min){
                secondMin =min;
                min = arr[i];
            }else if(arr[i]<secondMin){
                secondMin = arr[i];
            }
        }

        int max = Integer.MIN_VALUE;
        int secondMax = max;

        for(int i =0;i<n;i+=2){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax){
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax+secondMin);
    }
}
