package DailyChellange;

import java.util.Scanner;

public class PerfectSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = 5;//scr.nextInt();

        int val =(int)Math.sqrt(n);
        int val1 = (int)Math.cbrt(n);


        int[] sqVal = new int[val];
        int[] qnVal = new int[val1];

        int i =1;
        int ind =0;
        while (i<val){
            sqVal[ind] = i*i;
            i++;
            ind++;
        }

        ind =0;
        i=1;
        while (i<val1){
            qnVal[ind] = i*i*i;
            i++;
            ind++;
        }
        int count =0;
        for(i =0;i<val;i++){
            for(int j =0;j<val1;j++){
                if(sqVal[i]+qnVal[j]<=n){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
