package codevita;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y, distance;

    public Point(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

public class Maze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int C = scanner.nextInt();

        int[][] maze = new int[R][C];

        for (int i = 0; i < R; ++i) {
            for (int j = 0; j < C; ++j) {
                maze[i][j] = scanner.nextInt();
            }
        }

        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        int targetX = scanner.nextInt();
        int targetY = scanner.nextInt();

        boolean[][][] visited = new boolean[R][C][3];

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(startX, startY, 0));
        visited[startX][startY][0] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Point current = q.poll();

            if (current.x == targetX && current.y == targetY) {
                System.out.println(current.distance);
                return;
            }

            for (int i = 0; i < 4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if (!visited[nx][ny][current.distance % 3]) {
                        if (maze[nx][ny] == 1) {
                            continue;
                        }

                        if (maze[nx][ny] == 3 && current.distance % 3 == 0) {
                            continue;
                        }

                        visited[nx][ny][current.distance % 3] = true;
                        q.add(new Point(nx, ny, current.distance + 1));
                    }
                }
            }
        }

        System.out.println("STUCK");
    }
}
