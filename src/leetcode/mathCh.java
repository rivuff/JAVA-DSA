package leetcode;

import java.util.Scanner;

public class mathCh {
    public static int MathChallenge(int num) {
        // code goes here
        int sum =0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }


    public static void main (String[] args) {
        // keep this function call here
        int ab= 140;

        int a = MathChallenge(ab);

        String str = "64s9b7z10f";
        String ans = new String();
        String sa= String.valueOf(a);
        int i=0;
        int count=0;
        int n = sa.length();
        while(i<n){
            if(count==0){
                ans += sa.charAt(i);
            }
            else if(count==1){
                ans +=str.charAt(i);
            }
            count++;
            if(count==2){
                i++;
                count=0;
            }
        }

        ans +=str.substring(i);

        System.out.println(ans);
    }
}
