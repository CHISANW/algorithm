package BaekJoonAlgorithm.Re_silver.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 단지번호붙이기 {
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int[][] board;
    static boolean[][] visited;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        visited = new boolean[n][n];

        for(int i =0; i<n;i++){
            String value = sc.next();
            for(int j =0; j<n;j++){
                board[i][j] = value.charAt(j) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i =0; i<n;i++){
            for(int j =0; j<n;j++){
                if(board[i][j] == 1 && !visited[i][j]){
                    visited[i][j] = true;
                    list.add(bfs(i, j));
                    count++;
                }
            }
        }
        list.sort((a,b) -> a-b);
        System.out.println(count);
        for (Integer i : list) {
            System.out.println(i);
        }

    }

    static int bfs(int r, int c){
        Queue<Point> q = new java.util.LinkedList<>();
        q.add(new Point(r, c));
        int result = 0;
        while (!q.isEmpty()){
            Point now = q.poll();
            result++;

            for(int i =0; i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];
                if(isNext(nr, nc) && board[nr][nc] == 1 && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.add(new Point(nr, nc));
                }
            }
        }
        return result;
    }

    static boolean isNext(int nr, int nc){
        return nr>=0 && nr<n && nc>=0 && nc<n;
    }

    static class Point{
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
