package CompanyBased.Accenture;

import java.util.Scanner;

public class DiffNumbers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int t = scr.nextInt();

        while(t-->0){
            int n = scr.nextInt();

            long sum = 0;
            long sqSum = 0;

            for(int i =1;i<=n;i++){
                sum+= i;
                sqSum += i*i;
            }

            long sumSq = sum*sum;

            System.out.println(Math.abs(sqSum-sumSq));
        }
    }
}
