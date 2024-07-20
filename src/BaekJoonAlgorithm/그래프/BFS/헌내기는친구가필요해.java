package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 헌내기는친구가필요해 {
    static char[][] board;
    static boolean[][] visited;
    static int n, m;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        Queue<Point> q = new LinkedList<>();

        board = new char[n][m];
        visited = new boolean[n][m];

        for(int i =0;i<n;i++){
            String line = sc.next();
            for(int j =0; j<m;j++){
                char c = line.charAt(j);
                if(c == 'I')
                    q.add(new Point(i,j));
                board[i][j] = c;
            }
        }

        int count = 0;
        while (!q.isEmpty()){
            Point now = q.poll();
            for(int i =0; i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(isRange(nr, nc) && !visited[nr][nc] && board[nr][nc] != 'X') {
                    visited[nr][nc] = true;
                    if(board[nr][nc] == 'P'){
                        count++;
                    }
                    q.add(new Point(nr, nc));
                }
            }
        }
        if(count == 0) {
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
    }


    static boolean isRange(int row, int col){
        return row >=0 && row<n && col >=0 && col<m;
    }
    static class Point{
        int r, c;

        Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
}
