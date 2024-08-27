package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 아기상어 {
    static int[][] board;
    static int[][] distance;
    static int n,m;
    static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0}; // 8방향 이동
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        distance = new int[n][m];

        Queue<Point> q = new LinkedList<>();
        for (int i =0; i<n;i++){
            for (int j =0; j<m;j++){
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1){
                    q.add(new Point(i, j));
                    distance[i][j] = 0;
                }else distance[i][j] = Integer.MAX_VALUE;
            }
        }

        while (!q.isEmpty()){
            Point now = q.poll();

            for (int i =0; i<8;i++){
                int nextR = now.r + dx[i];
                int nextC = now.c + dy[i];
                if (nextR>=0 && nextR<n && nextC>=0 && nextC<m){
                    if (distance[nextR][nextC] > distance[now.r][now.c] + 1){
                        distance[nextR][nextC] = distance[now.r][now.c] +1;
                        q.add(new Point(nextR,nextC));
                    }
                }
            }
        }

        int maxDistance = 0;
        for (int i =0; i<n;i++){
            for (int j =0; j<m;j++){
                maxDistance = Math.max(distance[i][j], maxDistance);
            }
        }

        System.out.println(maxDistance);
    }


    static class Point{
        int r;
        int c;

        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
}
