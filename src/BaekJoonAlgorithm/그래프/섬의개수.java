package BaekJoonAlgorithm.그래프;

import java.util.*;

public class 섬의개수 {
    static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1}; // 상, 하, 좌, 우, 우상, 좌상, 우하, 좌하
    static int[] dc = {0, 0, -1, 1, 1, -1, 1, -1}; // 상, 하, 좌, 우, 우상, 좌상, 우하, 좌하

    static int[][] land;
    static int w, h;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            w = sc.nextInt();   //col
            h = sc.nextInt();   //열
            land = new int[h+1][w+1];
            visited = new boolean[h+1][w+1];
            exit(w,h);

            madeLand(sc, w, h);
            int count = 0;

            for(int i = 1 ;i<=h; i++){
                for(int j = 1; j<=w;j++){
                    if(!visited[i][j]&& land[i][j]==1){
                        bfs(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }


    }

    static void bfs(int row ,int col){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(row,col));
        visited[row][col] = true;

        while (!q.isEmpty()) {
            Point now = q.poll();

            for (int i = 0; i < 8; i++) {
                int nr = now.row + dr[i];
                int nc = now.col + dc[i];
                if(isOutOfRange(nr, nc) && !visited[nr][nc] && land[nr][nc] == 1){
                    visited[nr][nc] = true;
                    q.add(new Point(nr, nc));
                }
            }
        }
    }

    private static boolean isOutOfRange(int row, int col){
        return row>=1 && row<=h && col >=1 && col<=w;
    }
    private static void madeLand(Scanner sc, int w, int h) {
        for(int i = 1; i<= h; i++){
            for(int j = 1; j<= w; j++){
                land[i][j] = sc.nextInt();
            }
        }
    }

    static class Point{
        int row, col;

        public Point(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    static void exit(int w, int h){
        if(w ==0 && h ==0) System.exit(0);
    }
}
