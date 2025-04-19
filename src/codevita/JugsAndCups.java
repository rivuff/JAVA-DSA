package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class JugsAndCups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read input values
        int N = sc.nextInt();
        int[] cups = new int[N];
        for (int i = 0; i < N; i++) {
            cups[i] = sc.nextInt();
        }
        int L = sc.nextInt();

        // Step 2: Sort the cup capacities
        Arrays.sort(cups);

        // Step 3: Create an array to store cup frequencies
        int[] frequencies = new int[N];

        // Step 4: Initialize variables
        int jugCapacity = L;
        int cupsUsed = 0;

        // Step 5: Iterate through cup capacities
        for (int i = N - 1; i >= 0; i--) {
            int cupSize = cups[i];
            int maxCups = jugCapacity / cupSize;
            frequencies[i] = maxCups;
            jugCapacity -= maxCups * cupSize;
            cupsUsed += maxCups;
        }

        // Step 6: Output cup capacities and frequencies
        for (int i = 0; i < N; i++) {
            System.out.print(cups[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.print(frequencies[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
