package BaekJoonAlgorithm.그래프;

import java.util.*;

public class 단지번호붙이기 {
    static int[][] board;
    static int[][] visited;
    static int n;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static List<Integer> list =  new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];
        visited = new int[n][n];



        for(int i = 0;i<n;i++){
            String line = sc.next();
            for(int j = 0;j<n;j++){
                int a = line.charAt(j) - '0';
                board[i][j] = a;
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0; j<n;j++){
                if(board[i][j]==1 && visited[i][j] ==0){
                    bfs(i,j);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i : list){
            System.out.println(i);
        }
    }
    
    // 넓이 우선 탐색
    static void bfs(int r, int c){
        Queue<Point> q = new LinkedList<>();

        q.add(new Point(r,c));
        int count = 1;
        visited[r][c] = 1;

        while(!q.isEmpty()){
            Point now = q.poll();
            for(int i=0;i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(nr<0 || nr>=n || nc<0 || nc>=n) continue;
                if(board[nr][nc]==1 && visited[nr][nc]==0){
                    q.add(new Point(nr, nc));
                    visited[nr][nc] = visited[now.r][now.c]+1;
                    count++;
                }
            }
        }
        list.add(count);
    }

    static class Point{
        int r, c;
        public Point(int r,int c){
            this.r = r;
            this.c = c;
        }
    }

}
