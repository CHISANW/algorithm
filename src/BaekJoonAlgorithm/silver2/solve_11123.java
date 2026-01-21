package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class solve_11123 {
    static char[][] board;
    static boolean[][] visited;
    static int n, m;
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            board = new char[n][m];
            visited = new boolean[n][m];

            for(int i= 0; i<n;i++){
                String line = br.readLine();
                for(int j =0; j<m;j++){
                    board[i][j] = line.charAt(j);
                }
            }
            System.out.println(bfs());
        }
    }

    static int bfs(){
        int result = 0;
        Queue<Point> q = new LinkedList<>();

        for(int i =0; i<n;i++){
            for(int j =0; j<m;j++){
                if(board[i][j] =='#' && !visited[i][j]){
                    visited[i][j] = true;
                    q.add(new Point(i, j));
                    while (!q.isEmpty()) {
                        Point now = q.poll();
                        for(int d =0; d<4;d++) {
                            int nr = now.r + dr[d];
                            int nc = now.c + dc[d];

                            if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                            if (visited[nr][nc]) continue;
                            if (board[nr][nc] != '#') continue;

                            visited[nr][nc] = true;
                            q.add(new Point(nr, nc));
                        }
                    }
                    result++;
                }
            }
        }
        return result;
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
