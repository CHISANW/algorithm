package BaekJoonAlgorithm.그래프.BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 적록색약 {
    static char[][] board;
    static boolean[][] visited;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int n;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new char[n][n];
        visited = new boolean[n][n];

        for(int i =0; i<n;i++){
            String line = sc.next();
            for(int j =0; j<line.length();j++){
                char cmd = line.charAt(j);
                board[i][j] = cmd;
            }
        }
        int count1 = 0;

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(!visited[i][j]){
                    bfs(i,j);
                    count1++;
                }
            }
        }

        // 초기화
        visited = new boolean[n][n];

        for(int i =0; i<n;i++){
            for(int j =0; j<n;j++){
                if(board[i][j] == 'G')
                    board[i][j] = 'R';
            }
        }

        int count2 = 0;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(!visited[i][j]){
                    bfs(i,j);
                    count2++;
                }
            }
        }
        System.out.println(count1 +" "+ count2);
    }
    static void bfs(int r, int c){
        char nowColor = board[r][c];

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r, c));
        visited[r][c] = true;

        while (!q.isEmpty()){
            Point now = q.poll();
            for(int i =0;i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(!isRange(nr, nc)) continue;
                if(!visited[nr][nc] && board[nr][nc] == nowColor){
                    visited[nr][nc] = true;
                    q.add(new Point(nr,nc));
                }
            }
        }
    }

    static boolean isRange(int r, int c){
        return r>=0 && r<n && c>=0 && c<n;
    }


    static class Point{
        int r ,c;

        public Point(int r , int c){
            this.r = r;
            this.c = c;
        }
    }
}
