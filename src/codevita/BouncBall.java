package codevita;

import java.util.Scanner;

public class BouncBall {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n, m, ba1i, ba1j, ba2i, ba2j, posit1i, posit1j, posit2i, posit2j;
        n = scr.nextInt();
        m = scr.nextInt();
        ba1i = scr.nextInt();
        ba1j = scr.nextInt();
        posit1i = scr.nextInt();
        posit1j = scr.nextInt();
        ba2i = scr.nextInt();
        ba2j = scr.nextInt();
        posit2i = scr.nextInt();
        posit2j = scr.nextInt();

        int timed = 0;
        int inb1i = ba1i, inb1j = ba1j, inb2i = ba2i, inb2j = ba2j;
        int tSol = n + m - 1;
        boolean flag = false;

        while (true) {
            if (ba1i == ba2i && ba1j == ba2j)
                break;
            if (((inb1i == ba1i && inb1j == ba1j) || (inb2i == ba2i && inb2j == ba2j)) && timed != 0 && tSol <= 0) {
                flag = true;
                break;
            }
            if (ba1i== n || ba1i== 1)
                posit1i = -(posit1i);
            if (ba1j ==m || ba1j == 1)
                posit1j = -(posit1j);
            if (ba2i == n || ba2i == 1)
                posit2i = -(posit2i);
            if (ba2j == m || ba2j == 1)
                posit2j = -(posit2j);

            timed++;
            ba1i += posit1i;
            ba1j += posit1j;
            ba2i += posit2i;
            ba2j += posit2j;

            tSol--;
        }

        if (flag)
            System.out.println("Never");
        else
            System.out.println(timed);
    }
}
