package ReSolve;

import BaekJoonAlgorithm.그래프.BFS.유기농배추;

import java.util.*;

public class BekJoon_1012 {
    static int[][] board;
    static int[][] visited;
    static int n, m;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static List<Integer> list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            m = sc.nextInt();
            n = sc.nextInt();
            int k = sc.nextInt();
            board = new int[m][n];
            visited = new int[m][n];
            list = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                int row = sc.nextInt();
                int col = sc.nextInt();
                board[row][col] = 1;
            }
            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j] == 0 && board[i][j] == 1) {
                        bfs(i, j);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    static void bfs(int r, int c) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r, c));
        visited[r][c] = 1;

        while (!q.isEmpty()) {
            Point now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
                if (board[nr][nc] == 1 && visited[nr][nc] == 0) {
                    q.add(new Point(nr, nc));
                    visited[nr][nc] = visited[now.r][now.c] + 1;
                }
            }
        }
    }


    static class Point {
        int r;
        int c;

        public Point(int r, int c) {

            this.r = r;
            this.c = c;
        }
    }
}

