package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 점프왕쪨리_Large {
    static int[][] board;
    static int n;
    static String ans = "Hing";
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new int[n + 1][n + 1];
        visited = new boolean[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        bfs();


        System.out.println(ans);
    }

    static void bfs() {
        Queue<Point> q = new LinkedList<>();
        visited[1][1] = true;
        q.add(new Point(1, 1));

        boolean check = false;
        while (!q.isEmpty()) {
            Point now = q.poll();
            if (board[now.r][now.c] == -1) {
                check = true;
                break;
            }

            int[] dr = {0, board[now.r][now.c]};
            int[] dc = {board[now.r][now.c], 0};

            for (int i = 0; i<2;i++){
                int nr = now.r+dr[i];
                int nc = now.c+dc[i];
                if (!isRange(nr,nc)) continue;
                if (!visited[nr][nc]){
                    visited[nr][nc] =true;
                    q.add(new Point(nr,nc));
                }

            }
        }

        if (check) ans = "HaruHaru";
    }

    static public boolean isRange(int row, int col) {
        return row > 0 && row <= n && col > 0 && col <= n;
    }

    static class Point {
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
