package CompanyBased.Accenture;

import java.util.Scanner;

public class RatsFood {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n =scr.nextInt();
        int unit = scr.nextInt();

        int len = scr.nextInt();
        int[] arr = new int[len];
        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }


        System.out.println(solve(n, unit, arr));
    }

    static int solve(int n, int unit, int[] arr){
        int req = n*unit;

        if(arr.length==0){
            return -1;
        }

        int total = 0;
        int count=0;

        for(int i =0;i<arr.length;i++){
            total+=arr[i];

            if(total>req){
                count = i+1;
                break;
            }
        }

        return count;
    }
}
