package college;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scr = new Scanner(System.in);
            int t =scr.nextInt();

            for(int i=0;i<t;i++){
                int n = scr.nextInt();

                if(n%5!=0){
                    System.out.println(-1);
                }
                else if(n%10==0){
                    System.out.println(n/10);
                }
                else if(n%5==0){
                    System.out.println(n/10 +1);
                }
            }

    }
}
