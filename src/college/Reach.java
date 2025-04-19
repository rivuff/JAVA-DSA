package college;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Reach {
    public static void main(String[] args) {
        System.out.println(isReachable(3,1,7,3,3));
    }
    static class Cell {
        int x, y, time;

        public Cell(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public static boolean isReachable(int sx, int sy, int fx, int fy, int t) {
            int[][] directions = {
                    {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                    {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
            };
            PriorityQueue<Cell> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.time, b.time));
            queue.offer(new Cell(sx, sy, 0));

            while (!queue.isEmpty()) {
                Cell cell = queue.poll();
                int x = cell.x;
                int y = cell.y;
                int time = cell.time;

                if (x == fx && y == fy && time <= t) {
                    return true;
                }

                if (time >= t) {
                    continue; // Skip exploring beyond the time limit
                }

                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    int newTime = time + 1; // Travel time is 1 for all moves

                    if (newTime <= t) {
                        queue.offer(new Cell(nx, ny, newTime));
                    }
                }
            }

            return false;
        }
}
