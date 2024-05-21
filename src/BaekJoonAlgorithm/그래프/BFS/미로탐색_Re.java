package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 미로탐색_Re {
    static int[][] maze;
    static int[][] visited;
    static int  n, m;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   //row
        m = sc.nextInt();   //col

        //[1,1] 부터 사용하기 때문에 한칸을 추가로 사용
        maze = new int[n+1][m+2];
        visited = new int[n+1][m+2];

        for(int i =1;i<=n;i++){
            String line = sc.next();
            for(int j=1;j<=m;j++){
                maze[i][j] = line.charAt(j-1)-'0';
            }
        }

        visited[1][1] = 1;
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(1,1));
        while(!q.isEmpty()){
            Point now =q.poll();
            for(int i =0;i<4;i++){
                int row = now.r + dr[i];        // 다음 탐색할 열
                int col = now.c + dc[i];        // 다음 탐색할 행
                if(row<=0 || row>n || col <=0 || col>m) continue;
                if(visited[row][col]==0 && maze[now.r][now.c]==1){      //다음 탐색할 좌표의 값이 탐색을 하지않았고 , 현재 좌표가 존재할 때만 실행
                    visited[row][col] =visited[now.r][now.c]+1;     //다음 탐색의 값을 +1 하여 최종 탐색의 거리를 구함
                    q.add(new Point(row,col));
                }
            }
        }
        System.out.println(visited[n][m]);  // 배열의 마지막 탐색의 값을 출력
    }

    static class Point{
        int r;  //row
        int c;  //col

        public Point(int r, int c){
            this.r= r;
            this.c= c;
        }
    }
}
