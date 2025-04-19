package leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class cardGame {
    public static void main(String[] args) {
        int[] arr = {17,13,11,2,3,5,7};

        System.out.println(deckRevealedIncreasing(arr));
    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); // Sort the deck in increasing order

        int n = deck.length;
        int[] result = new int[n];
        Deque<Integer> indices = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            indices.add(i);
        }

        for (int card : deck) {
            int idx = indices.poll();
            result[idx] = card;
            if (!indices.isEmpty()) {
                indices.add(indices.poll());
            }
        }

        return result;
    }
}
