package codevita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RowGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ashokRow = "MMLMLLM"; //scanner.next();

        String anandRow =  "LMLLLMLM";//scanner.next();

        String winner = findWinner(ashokRow, anandRow);
        System.out.println(winner);
    }

    private static boolean isValidRow(String row) {
        int len = row.length();
        if (len < 3) {
            return false;
        }

        for (int i = 1; i < len - 1; i++) {
            if (row.charAt(i) == row.charAt(i - 1) || row.charAt(i) == row.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static List<String> generateThreeWordCombinations(String input) {
        List<String> combinations = new ArrayList<>();
        generateCombinationsHelper(0, input, "", 3, combinations);
        return combinations;
    }


    private static void generateCombinationsHelper(int ind, String input, String currentCombination, int wordsLeft, List<String> result) {

        if (wordsLeft == 0) {
            result.add(currentCombination.trim());
            return;
        }

        for (int i = ind; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String newCombination = currentCombination + currentChar;
            generateCombinationsHelper(ind+1, input, newCombination, wordsLeft - 1, result);
        }
    }

//    private static int countPossibilities(String row) {
//        int len = row.length();
////        if (!isValidRow(row)) {
////            return 0;
////        }
//
//        int count = 0;
//        for (int i = 0; i < len - 2; i++) {
//            for (int j = i + 2; j < len; j++) {
//                for (int k = i + 1; k < j; k++) {
//                    if (row.charAt(i) != row.charAt(j) && row.charAt(i) != row.charAt(k) && row.charAt(j) != row.charAt(k)) {
//                        count++;
//                    }
//                }
//            }
//        }
//
//        return count;
//    }

    private static String findWinner(String ashokRow, String anandRow) {
//        if (!isValidRow(ashokRow) || !isValidRow(anandRow)) {
//            return "Invalid input";
//        }

        List<String> list= generateThreeWordCombinations(ashokRow);


        for(String str : list){
            if(isValidRow(str)){
                System.out.print(str +  " " );
            }
        }

        return "";
//        int ashokPossibilities = countPossibilities(ashokRow);
//        int anandPossibilities = countPossibilities(anandRow);
//
//        if (ashokPossibilities > anandPossibilities) {
//            return "Ashok";
//        } else if (anandPossibilities > ashokPossibilities) {
//            return "Anand";
//        } else {
//            return "Draw";
//        }
    }
}
