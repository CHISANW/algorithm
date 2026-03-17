package BaekJoonAlgorithm.Re_silver.level1;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
    static int[] dr = new int[]{0, 0, 1, -1};
    static int[] dc = new int[]{1, -1, 0, 0};
    static int[][] board;
    static boolean[][] visited;
    static int n, m;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n;i++){
            String line = br.readLine();
            for(int j=0; j<m;j++){
                board[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(min+1);
    }

    static void bfs(int r, int c){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r, c, 0));
        visited[r][c] = true;

        while (!q.isEmpty()){
            Point now = q.poll();
            if(now.r == n-1 && now.c == m-1){
                min = Math.min(min, now.count);
            }
            for(int i =0; i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(isNext(nr, nc) && board[nr][nc] == 1 && !visited[nr][nc]){
                    q.add(new Point(nr, nc, now.count + 1));
                    visited[nr][nc] = true;
                }
            }
        }
    }

    static class Point{
        int r, c, count;

        public Point(int r, int c, int count) {
            this.r = r;
            this.c = c;
            this.count = count;
        }
    }

    static boolean isNext(int nr, int nc){
        return nr >= 0 && nr < n && nc >= 0 && nc < m;
    }
}
