package leetcode;

import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        int num = 687;
        String s = Integer.toString(num);

        char[] ar = s.toCharArray();
        int n = ar.length;
        int[] arr = new int[n];

        for(int i =0;i<ar.length;i++){
            arr[i] = Character.getNumericValue(ar[i]);
        }
        Arrays.sort(arr);
        int ans=  0;
        if(arr.length==2){
            ans=arr[0] + arr[1];
        }
        else if(n>2){
            int a = 0;
            int b= 0;
            int i =0;
            int j =1;
            while(i<n){
                a+=arr[i];
                i+=2;
                a=a*10;
            }
            a=a/10;
            while (j<n){
                b+=arr[j];
                j+=2;
                b=b*10;
            }
            b=b/10;

            ans = a+b;
        }

        System.out.println(ans);

    }

//    static int solve(int num){
//
//    }
}
