package codevita;
import java.util.Scanner;

public class ToyProfit {

    static long calculateProfit(long type, long[] availQt, long[] nedQuant, long[] pricQuant, long[] spToy, long remainAmount, long[][] memo) {
        if (type < 0 || remainAmount <= 0) {
            return 0;
        }

        if (memo[(int) type][(int) remainAmount] != -1) {
            return memo[(int) type][(int) remainAmount];
        }

        long notTake = calculateProfit(type - 1, availQt, nedQuant, pricQuant, spToy, remainAmount, memo);

        long take = 0;
        if (availQt[(int) type] >= nedQuant[(int) type]) {
            long maxPossibleTake = availQt[(int) type] / nedQuant[(int) type];
            for (long k = 0; k <= maxPossibleTake; ++k) {
                if (remainAmount >= (k * nedQuant[(int) type] * pricQuant[(int) type])) {
                    availQt[(int) type] -= k * nedQuant[(int) type];
                    remainAmount -= k * nedQuant[(int) type] * pricQuant[(int) type];
                    take = Math.max(take, k * spToy[(int) type] + calculateProfit(type - 1, availQt, nedQuant, pricQuant, spToy, remainAmount, memo));
                    // Revert the changes after the recursive call
                    availQt[(int) type] += k * nedQuant[(int) type];
                    remainAmount += k * nedQuant[(int) type] * pricQuant[(int) type];
                }
            }
        }

        memo[(int) type][(int) remainAmount] = Math.max(take, notTake);
        return memo[(int) type][(int) remainAmount];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long totalAmount = scanner.nextLong();
        long toyTypes = scanner.nextLong();

        long[] availableQuant = new long[(int) toyTypes];
        long[] neededQuant = new long[(int) toyTypes];
        long[] priceOfQuant = new long[(int) toyTypes];
        long[] spOfToy = new long[(int) toyTypes];

        for (int i = 0; i < toyTypes; i++) {
            availableQuant[i] = scanner.nextLong();
        }
        for (int i = 0; i < toyTypes; i++) {
            neededQuant[i] = scanner.nextLong();
        }
        for (int i = 0; i < toyTypes; i++) {
            priceOfQuant[i] = scanner.nextLong();
        }
        for (int i = 0; i < toyTypes; i++) {
            spOfToy[i] = scanner.nextLong();
        }

        long[][] memo = new long[(int) toyTypes][(int) (totalAmount + 1)];
        for (int i = 0; i < toyTypes; i++) {
            for (int j = 0; j <= totalAmount; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(calculateProfit(toyTypes - 1, availableQuant, neededQuant, priceOfQuant, spOfToy, totalAmount, memo));
    }
}
