package BaekJoonAlgorithm.그래프.BFS;

import java.io.*;
import java.util.*;

public class 전투 {
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1};
    static int n, m;
    static int[][] board;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();
        String[] split = value.split(" ");
        m = Integer.parseInt(split[0]);  // 가로
        n = Integer.parseInt(split[1]);  // 세로

        board = new int[n][m];  // 가로는 m, 세로는 n
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                char ch = line.charAt(j);
                if (ch == 'W') board[i][j] = 1;   // White 군사
                else if (ch == 'B') board[i][j] = 0;  // Blue 군사
            }
        }

        int blue = 0;
        int white = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    int size = bfs(i, j, board[i][j]);
                    if (board[i][j] == 0) {  // Blue
                        blue += size * size;
                    } else {  // White
                        white += size * size;
                    }
                }
            }
        }

        System.out.println(white + " " + blue);
    }

    static int bfs(int row, int col, int type) {
        Queue<Point> q = new LinkedList<>();
        visited[row][col] = true;
        q.add(new Point(row, col));
        int size = 0;

        while (!q.isEmpty()) {
            Point now = q.poll();
            size++;

            for (int i = 0; i < 4; i++) {
                int nr = now.row + dx[i];
                int nc = now.col + dy[i];

                if (isRange(nr, nc) && !visited[nr][nc] && board[nr][nc] == type) {
                    q.add(new Point(nr, nc));
                    visited[nr][nc] = true;
                }
            }
        }

        return size;
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
