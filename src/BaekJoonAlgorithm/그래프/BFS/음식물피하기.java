package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

/**
 * 문제 풀이 시간 : 8분 27초
 */
public class 음식물피하기 {
    static int[][] board;
    static boolean[][] visited;
    static int n, m, k;
    static int[] dx = {-1,1,0,0}; // 상 하 좌 우
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        board = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];

        for (int i =0; i<k;i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            board[row][col] = 1;
        }

        int max = 0;
        for (int i= 1;i<=n;i++){
            for (int j =1; j<=m;j++){
                if (board[i][j] == 1) {
                    visited[i][j] = true;
                    max = Math.max(bfs(i, j),max);
                }
            }
        }
        System.out.println(max);
    }

    static int bfs(int row, int col){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(row,col));

        int size = 0;
        while (!q.isEmpty()){
            Point now = q.poll();
            size++;

            for (int i =0; i<4;i++){
                int nr = now.r + dx[i];
                int nc = now.c + dy[i];

                if (!isRange(nr,nc))continue;
                if (!visited[nr][nc] && board[nr][nc]==1){
                    visited[nr][nc] = true;
                    q.add(new Point(nr,nc));
                }
            }

        }
        return size;
    }

    static boolean isRange(int row, int col){
        return row>=1 && row<=n && col>=1 && col<=m;
    }

    static class Point{
        int r, c;

        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
}
