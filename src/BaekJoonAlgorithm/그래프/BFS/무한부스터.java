package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 무한부스터 {
    static int[][] board;
    static boolean[][] visited;
    static int n, m;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        bfs();

        System.out.println(min);
    }

    static void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(1, 1, 0));
        visited[1][1] = true;

        while (!q.isEmpty()) {
            Point now = q.poll();
            int r = now.r;
            int c = now.c;
            if (r == n && c == m) {
                min = Math.min(now.count, min);
            }
            int boost = board[r][c];

            for (int i = 1; i <= boost; i++) {
                if (isRange(r + i, c) && !visited[r + i][c]) {
                    q.add(new Point(r + i, c, now.count + 1));
                    visited[r + i][c] = true;
                }
                if (isRange(r, c + i) && !visited[r][c + i]) {
                    q.add(new Point(r, c + i, now.count + 1));
                    visited[r][c + i] = true;
                }
            }

        }
    }

    static boolean isRange(int row, int col) {
        return row >= 1 && row <= n && col >= 1 && col <= m;
    }

    static class Point {
        int r;
        int c;
        int count;

        public Point(int r, int c, int count) {
            this.r = r;
            this.c = c;
            this.count = count;
        }
    }
}
