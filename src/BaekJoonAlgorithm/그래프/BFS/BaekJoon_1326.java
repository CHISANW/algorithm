package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1326 {
    static int n;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        int bfs = bfs(start, end);
        System.out.println(bfs);
    }

    static int bfs(int start, int end) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0, start));
        visited[start] = true;

        while (!q.isEmpty()) {
            Point poll = q.poll();
            if (poll.index == end) {
                return poll.count;
            }


            for (int direction : new int[]{-1, 1}) {
                for (int i = 1; i <= n; i++) {
                    int nextIndex = poll.index + direction * arr[poll.index] * i;

                    if (isRange(nextIndex) && !visited[nextIndex]) {
                        visited[nextIndex] = true;
                        q.add(new Point(poll.count + 1, nextIndex));
                    }
                }
            }
        }
        return -1;
    }

    static boolean isRange(int index) {
        return index <= n && index >= 1;
    }

    static class Point {
        int count;
        int index;

        public Point(int count, int index) {
            this.count = count;
            this.index = index;
        }
    }
}
