package college;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n =scr.nextInt();

        String str = Integer.toString(n);
        StringBuilder s = new StringBuilder(str);

        s.reverse();

        System.out.println(s);
    }
}
