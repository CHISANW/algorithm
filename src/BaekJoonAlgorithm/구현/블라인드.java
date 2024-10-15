package BaekJoonAlgorithm.구현;

import java.io.*;
import java.util.*;

public class 블라인드 {
    static char[][] board;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean[][] visited;
    static int[] answer = new int[5];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int row = n * 5 + 1;
        int col = m * 5 + 1;

        board = new char[row][col];
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < col; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && (board[i][j] == '.' || board[i][j] =='*')) {
                    int type = bfs(i, j);
                    checkType(type);
                }
            }
        }

        for (int i : answer) {
            System.out.print(i+" ");
        }



    }

    static int bfs(int row, int col) {

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(row, col));
        visited[row][col] = true;
        int count = 0;

        while (!q.isEmpty()) {
            Point now = q.poll();
            if (board[now.row][now.col] == '*'){
                count++;
            }
            for (int i = 0; i < 4; i++) {
                int nr = now.row + dr[i];
                int nc = now.col + dc[i];

                if (board[nr][nc] != '#' && !visited[nr][nc]) {
                    q.add(new Point(nr, nc));
                    visited[nr][nc] =true;
                }
            }
        }
        return count;
    }

    public static void checkType(int count) {
        switch (count) {
            case 0 : {
                answer[0]++;
                break;
            }
            case 4 : {
                answer[1]++;
                break;
            }
            case 8 : {
                answer[2]++;
                break;
            }
            case 12 : {
                answer[3]++;
                break;
            }
            case 16 : {
                answer[4]++;
                break;
            }
        }
    }

    public static class Point {
        int row;
        int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
