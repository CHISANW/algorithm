package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 돌다리 {
    static int a, b, n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();

        int[] moves = {1, -1, a, -a, b, -b};
        boolean[] visited = new boolean[100001];
        Queue<Point> queue = new LinkedList<>();

        queue.add(new Point(n, 0));
        visited[n] = true;

        if (n == m) {
            System.out.println(0);
            return;
        }

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int move : moves) {
                int nextPosition = current.value + move;

                if (isInRange(nextPosition) && !visited[nextPosition]) {
                    visited[nextPosition] = true;
                    queue.add(new Point(nextPosition, current.count + 1));
                    if (nextPosition == m) {
                        System.out.println(current.count + 1);
                        return;
                    }
                }
            }

            for (int multiplier : new int[]{a, b}) {
                int nextPosition = current.value * multiplier;

                if (isInRange(nextPosition) && !visited[nextPosition]) {
                    visited[nextPosition] = true;
                    queue.add(new Point(nextPosition, current.count + 1));
                    if (nextPosition == m) {
                        System.out.println(current.count + 1);
                        return;
                    }
                }
            }
        }

        System.out.println(-1);
    }

    static boolean isInRange(int position) {
        return position >= 0 && position <= 100000;
    }

    static class Point {
        int value, count;

        public Point(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }
}
