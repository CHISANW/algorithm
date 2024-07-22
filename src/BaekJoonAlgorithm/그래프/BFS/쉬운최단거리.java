package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 쉬운최단거리 {
    static int[][] board;
    static int[][] check;
    static int[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        check = new int[n][m];
        visited = new int[n][m];
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int value = sc.nextInt();
                if (value == 2) {
                    q.add(new Point(i, j));
                    visited[i][j] = 1;
                    check[i][j] = 0;
                } else if (value == 0) {
                    visited[i][j] = 1;
                }
                board[i][j] = value;
            }
        }

        while (!q.isEmpty()) {
            Point now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if (isRange(nr, nc) && visited[nr][nc] == 0 && board[nr][nc] == 1) {
                    check[nr][nc] = check[now.r][now.c] + 1;
                    q.add(new Point(nr, nc));
                    visited[nr][nc] = 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1 && visited[i][j] == 0) {
                    sb.append("-1 ");
                } else {
                    sb.append(check[i][j] + " ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    static boolean isRange(int a, int b) {
        return a >= 0 && a < n && b >= 0 && b < m;
    }

    static class Point {
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
