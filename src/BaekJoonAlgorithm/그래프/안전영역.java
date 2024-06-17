package BaekJoonAlgorithm.그래프;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 안전영역 {
    static int n;
    static int[][] area;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        area = new int[n][n];

        int maxHeight = Integer.MIN_VALUE;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                area[i][j] = sc.nextInt();
                if(maxHeight < area[i][j]){
                    maxHeight = area[i][j];
                }
            }
        }

        int maxSafe=0;
        for(int height = 0; height <= maxHeight; height++){
            visited = new boolean[n][n];
            int safeZone = 0;

            for(int i =0; i<n;i++){
                for(int j = 0; j<n;j++){
                    if(!visited[i][j] && area[i][j]>height) {
                        bfs(i, j, height);
                        safeZone++;
                    }
                }
            }
            if(safeZone> maxSafe){
                maxSafe = safeZone;
            }
        }

        System.out.println(maxSafe);
    }

    static void bfs(int row, int col, int height){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(row,col));
        visited[row][col] =true;

        while (!q.isEmpty()){
            Point now = q.poll();

            for(int i =0; i<4;i++){
                int nr = now.row + dr[i];
                int nc = now.col + dc[i];

                if(isOutOfRange(nr,nc) && !visited[nr][nc] && area[nr][nc]>height){
                    visited[nr][nc] = true;
                    q.add(new Point(nr,nc));
                }
            }
        }
    }

    static class Point{
        int row, col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    static boolean isOutOfRange(int row ,int col){
        return row >= 0 && row < n && col >= 0 && col < n;
    }
}
