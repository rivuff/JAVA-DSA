package leetcode;

import java.util.PriorityQueue;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }
        int totalSize = 0;
        while (pq.size() > 1) {
            int size1 = pq.poll();
            int size2 = pq.poll();
            int newSize = size1 + size2;
            totalSize += newSize;
            pq.offer(newSize);
        }
        System.out.println(totalSize);
    }
}
