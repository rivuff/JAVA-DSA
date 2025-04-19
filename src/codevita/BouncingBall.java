package codevita;

import java.util.Scanner;

public class BouncingBall {

    public static int[] calculateOverlap(int m, int n, int[] pos1, int[] dir1, int[] pos2, int[] dir2) {
        int steps = 0;

        while (true) {
            int[] newPos1 = {pos1[0] + dir1[0], pos1[1] + dir1[1]};

            if (newPos1[0] < 0 || newPos1[0] >= m || newPos1[1] < 0 || newPos1[1] >= n) {
                dir1[0] = -dir1[0];
                dir1[1] = -dir1[1];
            }

            pos1 = newPos1;

            int[] newPos2 = {pos2[0] + dir2[0], pos2[1] + dir2[1]};

            if (newPos2[0] < 0 || newPos2[0] >= m || newPos2[1] < 0 || newPos2[1] >= n) {
                dir2[0] = -dir2[0];
                dir2[1] = -dir2[1];
            }

            pos2 = newPos2;

            if (pos1[0] == pos2[0] && pos1[1] == pos2[1]) {
                return new int[]{steps, pos1[0], pos1[1]};
            }

            steps++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[] position1 = {scanner.nextInt(), scanner.nextInt()};
        int[] direction1 = {scanner.nextInt(), scanner.nextInt()};

        int[] position2 = {scanner.nextInt(), scanner.nextInt()};
        int[] direction2 = {scanner.nextInt(), scanner.nextInt()};

        int[] result = calculateOverlap(rows, cols, position1, direction1, position2, direction2);

        if (result[0] != -1) {
            System.out.println(result[0] + 1);
        } else {
            System.out.println("Never");
        }
    }
}
