package programmers.그리디;

import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/159993
public class 미로탈출 {

    public static void main(String[] args) {
        String[] maps  = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
        System.out.println(solution(maps));     //result -> 16

        String[] maps1  = {"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"};
        System.out.println(solution(maps1));     //result -> 16
    }


    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int n ,m;
    static char[][]map;
    static int solution(String[] maps){

        n = maps.length;
        m = maps[0].length();

        map = new char[n][m];

        for(int i =0 ;i<n; i++){
            char[] line = maps[i].toCharArray();
            for(int j =0; j<m;j++){
                map[i][j] = line[j];
            }
        }


        Point start = null, lever = null, end = null;

        for(int i = 0;  i<n;i++){
            for(int j = 0; j<m;j++){
                char c = map[i][j];
                if(c == 'S') start = new Point(i, j);
                else if (c=='L') lever = new Point(i,j);
                else if (c=='E') end = new Point(i,j);
            }
        }

        int startLever = bfs(start,lever);
        int leverEnd = bfs(lever, end);


        return startLever == -1 ||  leverEnd == -1 ? -1 : startLever+leverEnd;
    }

    static int bfs(Point start, Point end){
        Queue<Point> q = new LinkedList<>();
        int[][] visited  = new int[n][m];
        visited[start.r][start.c] = 1;
        q.add(start);
        while (!q.isEmpty()){
            Point now = q.poll();

            for(int i = 0;i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(nr<0 || nr>=n|| nc <0 || nc>=m) continue;;
                if(visited[nr][nc]>0) continue;
                if(map[nr][nc] == 'X') continue;

                visited[nr][nc]  = visited[now.r][now.c]+1;
                q.add(new Point(nr, nc));

                if(nr == end.r && nc == end.c){
                    return visited[end.r][end.c]-1;
                }
            }

        }
        return -1;
    }

    static class Point{
        int r, c ;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
