package CompanyBased.Accenture;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int t = scr.nextInt();
        int[] arr = new int[t];

        for(int i=0;i<t;i++){
            arr[i] = scr.nextInt();
        }
        int ch = 0;
        int bi = 0;
        int back = 0;

        for(int i =0;i<t;i++){
            if(i%3==0){
                ch+= arr[i];
            }else if(i%3==1){
                bi+=arr[i];
            }
            else if(i%3==2){
                back+=arr[i];
            }
        }

        if(ch>bi && ch>back){
            System.out.println("chest");
        }else if(bi>ch && bi>back){
            System.out.println("biceps");
        }else System.out.println("back");

    }
}
