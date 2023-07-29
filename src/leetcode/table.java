package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class table {

    public static int ArrayChallenge(int[] arr) {
        if (arr.length < 2) {
            return 0; // There must be at least 2 desks to seat 2 students.
        }

        int K = arr[0];  // Total number of desks in the classroom
        int occupiedDesks = arr.length - 1; // Number of desks already occupied
        int emptyDesks = K - occupiedDesks; // Number of empty desks

        int waysToSeatStudents = 0;
        for (int i = 1; i < arr.length; i++) {
            // Check if the desk below is empty
            if ((i + 1) <= K && arr[i + 1] == 0) {
                waysToSeatStudents++;
            }

            // Check if the desk to the right is empty
            if ((i + 2) <= K && arr[i + 2] == 0) {
                waysToSeatStudents++;
            }
        }

        return waysToSeatStudents;
    }


    public static void main(String[] args) {
        // Keep the function call here
//        Scanner s = new Scanner(System.in);
//        String input = s.nextLine();
//        String[] inputArray = input.split(", ");
//        int[] arr = new int[inputArray.length];
//        for (int i = 0; i < inputArray.length; i++) {
//            arr[i] = Integer.parseInt(inputArray[i]);
//        }
//        System.out.println(ArrayChallenge(arr));

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        List<Integer> list = new ArrayList<>();

    }
}
