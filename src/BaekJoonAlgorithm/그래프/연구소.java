package BaekJoonAlgorithm.그래프;

import java.util.*;

public class 연구소 {
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int[][] board;
    static int n,m;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                board[i][j] = sc.nextInt();
            }
        }

        dfs(0);

        System.out.println(max);
    }

    static void dfs(int x){
        if(x == 3){
            bfs();
            return;
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(board[i][j]==0) {
                    board[i][j] = 1;
                    dfs(x + 1);
                    board[i][j] = 0;
                }
            }
        }
    }

    static void bfs(){

        Queue<Point> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j =0; j<m;j++){
                if(board[i][j]==2){
                    q.add(new Point(i,j));
                }
            }
        }

        int[][] copy = new int[n][m];

        for(int i =0;i<board.length;i++){
            copy[i] = board[i].clone();
        }

        while(!q.isEmpty()){
            Point now = q.poll();

            for(int i =0;i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    if(copy[nr][nc]==0){
                        copy[nr][nc] = 2;
                        q.add(new Point(nr, nc));
                    }
                }
            }
        }

        safeZoneCheck(copy);
    }

    static void safeZoneCheck(int[][] copy){

        int count = 0;
        for(int i =0;i<n;i++){
            for(int j =0; j<m;j++){
                if(copy[i][j]==0){
                    count++;
                }
            }
        }

        max = Math.max(count,max);
    }


    static class Point{
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
