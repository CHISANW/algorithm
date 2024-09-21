package BaekJoonAlgorithm.그래프.BFS;

import java.io.*;
import java.util.*;

public class 현수막 {
    static int[][] board;
    static boolean[][] visited;
    static int r, c;
    static int[] dr = {-1, 1, 0, 0, -1, 1, 1, -1};
    static int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st= new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        board = new int[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int ans = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && board[i][j] == 1) {
                    visited[i][j] = true;
                    bfs(i, j);
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    static void bfs(int row, int col) {

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(row,col));

        while (!q.isEmpty()){
            Point now = q.poll();

            for (int i =0; i<8;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if (isRange(nr,nc) && !visited[nr][nc] && board[nr][nc]==1){
                    q.add(new Point(nr,nc));
                    visited[nr][nc] = true;
                }
            }
        }
    }

    static boolean isRange(int row, int col){
        return row>=0 && row<r && col>=0 && col<c;
    }

    static class Point {
        int r, c;

        public Point(int row, int col) {
            this.r = row;
            this.c = col;
        }
    }
}
