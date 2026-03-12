package programmers.Re_Level_2;

import java.util.*;

public class 게임맵최단거리 {

    static int[][] board;
    static boolean[][] visited;
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static int r,c, answer;

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
        System.out.println(solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}}));
    }

    public static int solution(int[][] maps) {
        r = maps.length;
        c = maps[0].length;
        board = maps;
        visited = new boolean[r][c];
        answer = Integer.MAX_VALUE;
        bfs();
        return answer == Integer.MAX_VALUE ? -1 : answer ;
    }

    static void bfs(){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0,0,1));
        visited[0][0] = true;

        while (!q.isEmpty()){
            Point now = q.poll();
            if(now.r == r-1 && now.c == c-1) {
                answer = Math.min(answer, now.count);
            }

            for(int i =0;i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(isNext(nr,nc)){
                    q.add(new Point(nr,nc,now.count+1));
                    visited[nr][nc] = true;
                }
            }

        }


    };

    static boolean isNext(int nr, int nc){
        return nr >= 0 && nr < r && nc >= 0 && nc < c && board[nr][nc] == 1 && !visited[nr][nc];
    }

    static class Point{
        int r,c, count;

        public Point(int r, int c,int count) {
            this.r = r;
            this.c = c;
            this.count = count;
        }
    }
}
