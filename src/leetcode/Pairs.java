package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Pairs {
    public static void main(String[] args) {
        int [] ar = {6, 3, 4, 7, 6};
        int s = 10;
        System.out.println(countMatchingPairs(ar,s));
    }

    public static int countMatchingPairs(int[] scores, int s) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int score : scores) {
            freq.put(score, freq.getOrDefault(score, 0) + 1);
        }

        int pairs = 0;
        for (int x : freq.keySet()) {
            int y = s - x;
            if (freq.containsKey(y)) {
                int countX = freq.get(x);
                int countY = freq.get(y);
                if (x == y) {
                    // If x and y are the same, we need to count the number of pairs of users with score x
                    pairs += countX * (countX - 1) / 2;
                } else {
                    // Otherwise, we can count the number of pairs of users with score x and score y separately
                    pairs += countX * countY;
                }
            }
        }

        // Divide by 2 because each pair is counted twice (i.e., (x, y) and (y, x))
        return pairs/2;
    }

}
