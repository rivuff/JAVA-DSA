package codevita;
import java.util.Arrays;
import java.util.Scanner;

public class PerfectBudget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] projects = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                projects[i][j] = scanner.nextInt();
            }
        }

        int result = calculateMinimumBudget(projects);
        System.out.println(result);

        scanner.close();
    }

    private static int calculateMinimumBudget(int[][] projects) {
        Arrays.sort(projects, (a, b) -> Integer.compare(a[1] - a[2], b[1] - b[2]));

        int budget = 0;
        int currentBudget = 0;

        for (int[] project : projects) {
            int bonusMinusPenalty = project[1] - project[2];
            currentBudget += project[0];

            if (bonusMinusPenalty < 0 && currentBudget < Math.abs(bonusMinusPenalty)) {
                budget += Math.abs(bonusMinusPenalty) - currentBudget;
                currentBudget = Math.abs(bonusMinusPenalty);
            }
        }

        return budget + currentBudget;
    }
}

