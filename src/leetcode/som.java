package leetcode;

import java.util.Scanner;

public class som {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t =1;// scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n =61;// scanner.nextInt(); // number in the array

            if (isEmirp(n)) {
                System.out.println(n);
            } else {
                int reversed = reverseNumber(n);
                int closestPrime = findClosestPrime(reversed);
                int diff = Math.abs(n - reversed);

                System.out.println(closestPrime);
//                if (closestPrime != -1 && closestPrime != reversed && diff <= reversed) {
//                    System.out.println(closestPrime);
//                } else {
//                    System.out.println(0);
//                }
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to reverse a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // Function to find the closest prime number less than the given number
    public static int findClosestPrime(int number) {
        for (int i = number - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1; // no prime found
    }

    // Function to check if a number is an emirp number
    public static boolean isEmirp(int number) {
        int reversed = reverseNumber(number);
        return isPrime(number) && isPrime(reversed);
    }
}
