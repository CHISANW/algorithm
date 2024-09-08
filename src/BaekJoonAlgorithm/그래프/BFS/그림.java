package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그림 {
    static int[][] board;
    static boolean[][] visited;
    static int n ,m;
    static int[] dx = {-1,1,0,0}; // 상 하 좌 우
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int count = 0;
        int max = 0;
        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i =0;i<n;i++){
            for (int j=0;j<m;j++){
                board[i][j] = sc.nextInt();
            }
        }

        for (int i =0; i<n;i++){
            for (int j =0; j<m;j++){
                if (!visited[i][j] && board[i][j]==1){
                    visited[i][j] = true;
                    count++;
                    max = Math.max(bfs(i,j),max);
                }
            }
        }

        System.out.println(count);
        System.out.println(max);

    }



    static int bfs(int row ,int col){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(row,col));
        int size = 0;

        while(!q.isEmpty()){
            Point now = q.poll();
            size++;

            for (int i =0; i<4;i++){
                int nr = now.row + dx[i];
                int nc = now.col + dy[i];

                if (!isRange(nr,nc)) continue;
                if (!visited[nr][nc] && board[nr][nc] == 1){
                    visited[nr][nc] = true;
                    q.add(new Point(nr,nc));
                }
            }
        }

        return size;
    }


    static boolean isRange(int row, int col){
        return row>=0 && row<n && col>=0 && col<m;
    }
    static class Point{
        int row, col;

        public Point(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
}
