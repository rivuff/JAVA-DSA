package CompanyBased.Accenture;

import java.util.Scanner;

public class PerfectString {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }


        int flag= 0;
        int count0 =0;
        int count1 = 1;

        for(int i =0;i<n;i++){
            if(arr[i]==1){
                flag = 1;
                while (i<n){
                    if(arr[i]==0){
                        count0++;
                    }else if(arr[i]==1){
                        count1++;
                    }
                    i++;
                }
            }
        }
        if(flag==0){
            System.out.println(0);
        }
        else System.out.println(Math.min(count0,count1));
    }
}
