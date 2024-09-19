package BaekJoonAlgorithm.그래프.DFS;

import java.util.Scanner;

public class 컴백홈 {
    static int r, c, k;
    static int[][] board;
    static boolean[][] visited;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();
        c = sc.nextInt();
        k = sc.nextInt();

        board = new int[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String line = sc.next();
            for (int j = 0; j < c; j++) {
                board[i][j] = line.charAt(j) == 'T' ? 1 : 0;
            }
        }

        visited[r-1][0] = true;
        dfs(r-1,0,1);

        System.out.println(count);
    }

    static void dfs(int row, int col, int steps) {
        if (row == 0 && col == c - 1 && steps == k) {
            count++;
            return;
        }

        for (int i =0; i<4;i++){
            int nr = row+dr[i];
            int nc = col+dc[i];
            if (!isRange(nr,nc)) continue;
            if (!visited[nr][nc] && board[nr][nc]!=1) {
                visited[nr][nc] = true;
                dfs(nr,nc,steps+1);
                visited[nr][nc] =false;
            }

        }
    }
    static boolean isRange(int row ,int col){
        return row>=0 && row<r && col >=0 && col<c;
    }
}
