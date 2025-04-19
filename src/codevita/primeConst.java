package codevita;

import java.util.Scanner;

public class primeConst {

    static int gcd(int a, int b)
    {
        return b == 0? a : gcd(b, a % b);
    }

    // recursive implementation
    static int LcmOfArray(int[] arr, int idx)
    {
        if (idx == arr.length - 1){
            return arr[idx];
        }
        int a = arr[idx];
        int b = LcmOfArray(arr, idx+1);
        return (a*b/gcd(a,b));
    }

    static boolean isPrime(int val){
        for(int i =2;i<=val/2;i++){
            if(val%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);

        int[] arr = new int[3];
        for(int i =0;i<3;i++){
            arr[i] = scr.nextInt();
        }

        int k = scr.nextInt();

       int val = LcmOfArray(arr,0) + k;

        if(isPrime(val)){
            System.out.println(val);
        }else System.out.println("None");
    }
}
