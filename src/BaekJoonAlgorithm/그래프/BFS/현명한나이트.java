package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 현명한나이트 {
    static int n;
    static int[][] dist;
    static int[] dr = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        int m = sc.nextInt();

        int kRow = sc.nextInt();
        int kCol = sc.nextInt();
        bfs(kRow, kCol);

        for (int i =0; i<m;i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            int value = dist[row][col];
            sb.append(value).append(" ");
        }

        System.out.println(sb);


    }

    static void bfs(int kRow, int kCol) {
        dist = new int[n + 1][n + 1];
        boolean[][] visited = new boolean[n + 1][n + 1];
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(kRow, kCol, 0));

        while (!q.isEmpty()) {
            Point now = q.poll();
            dist[now.row][now.col] = now.count;

            for (int i =0; i<8;i++){
                int nr = now.row + dr[i];
                int nc = now.col + dy[i];

                if (!isRange(nr,nc)) continue;
                if (!visited[nr][nc]){
                    q.add(new Point(nr,nc, now.count+1));
                    visited[nr][nc] = true;
                }
            }

        }
    }

    static boolean isRange(int row, int col) {
        return row > 0 && row <= n && col > 0 && col <= n;
    }

    static class Point {
        int row;
        int col;
        int count;

        public Point(int row, int col, int count) {
            this.row = row;
            this.col = col;
            this.count = count;
        }
    }
}
