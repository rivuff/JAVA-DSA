package CompanyBased.Accenture;

import java.util.Scanner;

public class DiffNumDiv {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int m =scr.nextInt();

        System.out.println(diffSum(n,m));
    }

    public static int diffSum(int n,int m){
        int sum1 =0;
        int sum2 =0;
        for(int i =1;i<=m;i++){
            if(i %n ==0){
                sum1+=i;
            }else sum2+=i;
        }

        return Math.abs(sum1-sum2);
    }
}
