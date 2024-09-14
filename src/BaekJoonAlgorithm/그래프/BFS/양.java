package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 양 {
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1};
    static int r, c;
    static char[][] board;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();

        board = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String line = sc.next();
            for (int j = 0; j < c; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int wolf = 0;
        int sheep = 0;
        for (int i =0; i<r;i++){
            for (int j =0; j<c;j++){
                if (!visited[i][j] && board[i][j]!='#'){
                    int[] bfs = bfs(i, j);
                    int s = bfs[0];
                    int w = bfs[1];

                    if (s> w) sheep += s;
                    else wolf += w;
                }
            }
        }

        System.out.println(sheep +" "+wolf);
    }

    static int[] bfs(int row, int col){
        Queue<Point> q = new LinkedList<>();
        visited[row][col] = true;
        q.add(new Point(row,col));
        int[] arr = new int[2];
        arr[0] = 0; // 양
        arr[1] = 0; // 늑대
        
        while (!q.isEmpty()){
            Point now = q.poll();
            if (board[now.r][now.c]=='v') arr[1]++;
            if (board[now.r][now.c]=='o') arr[0]++;

            for (int i =0; i<4;i++){
                int nr = now.r + dx[i];
                int nc = now.c + dy[i];

                if (!isRange(nr,nc)) continue;
                if (!visited[nr][nc] && board[nr][nc]!='#'){
                    q.add(new Point(nr,nc));
                    visited[nr][nc] = true;
                }
            }
        }

        return arr;
    }

    static boolean isRange(int row, int col){
        return row>=0 && row<r && col >=0 && col <c;
    }
    static class Point{
        int r, c;

        public Point(int r,int c){
            this.r = r;
            this.c = c;
        }
    }
}
