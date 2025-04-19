package CompanyBased.Accenture;

import java.util.Scanner;
import java.util.Stack;

public class ChocolateDist {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        int n = scr.nextInt();
        int i = 1;
        int count = 0;
        while (true){
            if(n-i>i){
                count++;
                i++;
            }else break;
        }

        System.out.println(count);
    }
}
