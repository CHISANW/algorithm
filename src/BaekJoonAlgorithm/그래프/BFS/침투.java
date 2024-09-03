package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 침투 {
    static int n, m;
    static int[][] board;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};  // 상, 하, 좌, 우
    static int[] dc = {0, 0, -1, 1};
    static String ans = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String next = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = next.charAt(j) - '0';
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[0][i] == 0 && !visited[0][i]) {
                bfs(0, i);
            }
        }

        System.out.println(ans);
    }

    static void bfs(int row, int col) {
        Queue<Point> q = new LinkedList<>();

        q.add(new Point(row, col));
        visited[row][col] = true;

        while (!q.isEmpty()) {
            Point now = q.poll();
            int nowRow = now.row;
            int nowCol = now.col;

            if (nowRow == n - 1) {
                ans = "YES";
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nr = nowRow + dr[i];
                int nc = nowCol + dc[i];

                if (!isRange(nr, nc)) continue;
                if (!visited[nr][nc] && board[nr][nc] == 0) {
                    visited[nr][nc] = true;
                    q.add(new Point(nr, nc));
                }
            }
        }
    }

    static boolean isRange(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < m;
    }

    static class Point {
        int row, col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
