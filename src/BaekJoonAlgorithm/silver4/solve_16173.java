package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class solve_16173 {
    static int[][] board;
    static boolean[][] visited;
    static int n;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        visited = new boolean[n][n];

        for(int i =0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0,0));
        boolean isAnswer = false;

        while (!queue.isEmpty()){
            Point poll = queue.poll();
            int nextCount = board[poll.r][poll.c];
            if(nextCount == -1){
                isAnswer = true;
                break;
            }
            int[] dr = {-nextCount ,nextCount ,0 ,0};
            int[] dc = {0 ,0 ,-nextCount ,nextCount};

            for(int i =0; i<4;i++){
                int nr = poll.r + dr[i];
                int nc = poll.c + dc[i];

                if(nr<0 || nr>=n || nc<0 || nc>=n) continue;
                if(visited[nr][nc]) continue;
                visited[nr][nc] = true;
                queue.add(new Point(nr,nc));
            }
        }
        System.out.println( isAnswer ? "HaruHaru" : "Hing");


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
