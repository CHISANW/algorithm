package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BackJon_17129 {
    static int n, m;
    static int[][] board;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        visited = new boolean[n][m];

        int row = 0, col = 0;
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                int value = line.charAt(j) - '0';
                if (value == 2) {
                    row = i;
                    col = j;
                }
                board[i][j] = value;
            }
        }

        bfs(row, col);

        if (count == 0) System.out.println("NIE");
        else {
            System.out.println("TAK");
            System.out.println(count);
        }
    }

    static void bfs(int row, int col) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(row, col, 0));
        visited[row][col] = true;

        while (!q.isEmpty()) {
            Point now = q.poll();
            int r = now.r;
            int c = now.c;

            if (board[r][c] == 3 || board[r][c] == 4 || board[r][c] == 5) {
                count = now.d;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (!isRange(nr, nc)) continue;
                if (board[nr][nc] == 1) continue;
                if (!visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.add(new Point(nr, nc, now.d + 1));
                }
            }


        }
    }


    static boolean isRange(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < m;
    }

    static class Point {
        int r, c, d;

        public Point(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }
}
