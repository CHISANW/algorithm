package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 데스나이트 {
    static int n,startRow,startCol,endRow, endCol;
    static int[][] board;
    static int[][] distance;
    static boolean[][] visited;
    static int[] dx = {-2,-2,0,0,2,2};
    static int[] dy = {-1,1,-2,2,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];
        distance = new int[n][n];
        visited = new boolean[n][n];

        startRow = sc.nextInt();
        startCol = sc.nextInt();
        endRow = sc.nextInt();
        endCol = sc.nextInt();

        for (int i =0; i<n;i++){
            for (int j =0; j<n;j++){
                distance[i][j] = Integer.MAX_VALUE;
            }
        }
        distance[startRow][startCol] = 0;

        bfs();

        if (distance[endRow][endCol]==Integer.MAX_VALUE){
            System.out.println(-1);
        }else
            System.out.println(distance[endRow][endCol]);
    }

    static void bfs(){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(startRow,startCol));
        visited[startRow][startCol] = true;

        while (!q.isEmpty()){
            Point now = q.poll();

            for (int i =0; i<6;i++){
                int nr = now.r + dx[i];
                int nc = now.c + dy[i];

                if (!isRange(nr, nc)) continue;
                if (!visited[nr][nc] && distance[now.r][now.c] +1 < distance[nr][nc]){
                    distance[nr][nc] = distance[now.r][now.c]+1;
                    visited[nr][nc]= true;
                    q.add(new Point(nr,nc));
                }
            }
        }
    }

    static boolean isRange(int row, int col){
        return row >=0 && row<n && col >=0 && col<n;
    }
    static class Point{
        int r;
        int c;

        public Point(int row, int col){
            this.r = row;
            this.c = col;
        }
    }
}
