package BaekJoonAlgorithm.Re_silver.level2;

import java.io.*;
import java.util.*;

public class 유기농배추 {
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int[][] board;
    static boolean[][] visited;
    static int n, m;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            board = new int[n][m];
            visited = new boolean[n][m];

            for(int j =0; j<k;j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[x][y] = 1;
            }

            int answer = 0;
            for(int i =0; i<n;i++){
                for(int j =0; j<m;j++){
                    if(board[i][j] == 1 && !visited[i][j]){
                        bfs(i,j);
                        answer++;
                    }
                }
            }
            sb.append(answer).append("\n");
        }

        System.out.println(sb);

    }

    static void bfs(int r, int c){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r, c));
        visited[r][c] = true;
        while(!q.isEmpty()){
            Point now = q.poll();
            for(int i =0; i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];
                if(isNext(nr, nc) && board[nr][nc] == 1 && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.add(new Point(nr, nc));
                }
            }
        }
    }

    static boolean isNext(int r, int c){
        return r >= 0 && r < n && c >= 0 && c < m;
    }
    static class Point{
        int r, c;
        public Point(int x, int y){
            this.r = x;
            this.c = y;
        }
    }

}
