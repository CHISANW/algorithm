package programmers.그리디;

import java.util.*;

public class 게임맵최단거리 {
    public static void main(String[] args) {

        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));

        int[][] maps1 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        System.out.println(solution(maps1));
    }


    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int[][] visited;
    public static int solution(int[][] maps) {

        int row = maps.length;
        int col = maps[0].length;

        visited = new int[row][col];

        Queue<Point> q = new LinkedList<>();

        q.add(new Point(0,0));
        visited[0][0] = 1;

        while(!q.isEmpty()){
            Point now = q.poll();

            for(int i =0;i<4;i++){
                int nr = now.r+dr[i];
                int nc = now.c+dc[i];

                if(nr<0|| nr >=row|| nc<0 || nc>=col) continue;
                if(maps[nr][nc]==0) continue;

                if(visited[nr][nc]==0){
                    q.add(new Point(nr,nc));
                    visited[nr][nc] = visited[now.r][now.c]+1;
                }
            }
        }
        return visited[row-1][col-1] == 0 ? -1 :  visited[row-1][col-1];
    }

    static class Point{
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
