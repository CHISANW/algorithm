package ReSolve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1012 {
    static int[] dr = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;
    static int[][] board;
    static int m, n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0){
            m = sc.nextInt();
            n = sc.nextInt();
            int k = sc.nextInt();
            visited = new boolean[m][n];
            board = new int[m][n];
            for(int i = 0; i<k;i++){
                int r = sc.nextInt();
                int c = sc.nextInt();
                board[r][c] = 1;
            }

            int count = 0;
            for(int i =0; i<m;i++){
                for(int j =0; j<n;j++){
                    if(!visited[i][j] && board[i][j]==1){
                        bfs(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }

    }

    static void bfs(int r, int c){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r,c));
        visited[r][c] = true;

        while (!q.isEmpty()){
            Point now = q.poll();

            for(int i =0; i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dy[i];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
                if(visited[nr][nc] || board[nr][nc] == 0) continue;
                visited[nr][nc] = true;
                q.add(new Point(nr, nc));
            }
        }
    }

    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
