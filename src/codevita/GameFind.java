package codevita;
import java.util.Scanner;

public class GameFind {
    static int counting(String rowVal) {
        int cnt = 0;
        int lastSc = -1;

        for (int i = 0; i < rowVal.length() - 1; ++i) {
            if (rowVal.charAt(i) != rowVal.charAt(i + 1)) {
                cnt += (i - lastSc) * (rowVal.length() - i - 1);
                lastSc = i;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ash = scanner.next();
        String ana = scanner.next();

        if (ash.matches(".*[^ML].*") || ana.matches(".*[^ML].*")) {
            System.out.println("Invalid input");
        } else {
            int ashCnt = counting(ash);
            int anaCnt = counting(ana);

            if (ashCnt > anaCnt) {
                System.out.println("Ashok");
            } else if (anaCnt > ashCnt) {
                System.out.println("Anand");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
