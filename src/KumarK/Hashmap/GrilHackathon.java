package KumarK.Hashmap;

import java.util.Locale;
import java.util.Scanner;

public class GrilHackathon {
    public static void main(String[] args) {
//        Scanner scr = new Scanner(System.in);
//
//        int t= scr.nextInt();
//
//        long n = scr.nextLong();
//
//        long[] arr = new long[(int)n+1];
//
//        for(int i =1;i<=n;i++){
//            arr[i] = scr.nextLong();
//        }
//        long k = scr.nextLong();

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long[] a = new long[(int)(n + 1)];

        long k = scanner.nextLong();

        long i = 1;
        while (i <= n) {
            a[(int)i] = scanner.nextLong();
            i++;
        }

        long[] b = new long[200005];
        i = 1;
        while (i <= n) {
            long l = a[(int)i] - k;
            long r = a[(int)i] + k;
            b[(int)l] = b[(int)l] + 1;
            b[(int)(r + 1)] = b[(int)(r + 1)] - 1;
            i = i + 1;
        }

        long answer = 1;
        i = 1;
        while (i <= 200000) {
            b[(int)i] = b[(int)(i - 1)] + b[(int)i];
            answer = Math.max(b[(int)i], answer);
            i = i + 1;
        }

        System.out.println(answer);
    }

}
