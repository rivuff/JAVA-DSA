package DynamicProgramming;

import java.io.DataInputStream;
import java.math.BigInteger;
import java.util.*;

public class longestCommonSubsequence {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }

        int a =maximumCount(arr);

        System.out.println(a);

    }

    public static int maximumCount(int[] arr) {
        int n= arr.length;
        int pos=0;
        int neg =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                continue;
            }
            else if(arr[i]>0){
                pos++;
            }
            else{
                neg++;
            }
        }

        return Math.max(pos,neg);
    }
}
