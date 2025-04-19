package CompanyBased.Accenture;

import java.util.Scanner;

public class PyramidSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = 3;

        int i = 1;
        int sum = 0;
        while (i<=n){
            if(i==1){
                sum+= (n-i+1)*i;
            }else {
                sum+= (n-i+1)*i*2;
            }
            i++;
        }

        System.out.println(sum);
    }
}
