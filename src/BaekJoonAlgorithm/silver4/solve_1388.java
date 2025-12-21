package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_1388 {
    static int[][] board;
    static int n, m;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        board = new int[n][m];
        visited = new boolean[n][m];

        for(int i =0; i<n;i++){
            String line = sc.nextLine();
            for(int j =0; j<m;j++){
                board[i][j] = line.charAt(j);
            }
        }

        int count =0;
        for(int i =0; i<n;i++){
            for(int j =0; j<m;j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void dfs(int r, int c){
        visited[r][c] = true;

        if(board[r][c] == '-'){
            int nc = c+1;
            if(nc<m && !visited[r][nc] && board[r][nc] == '-'){
                dfs(r, nc);
            }
        }else{
            int nr = r+1;
            if(nr<n && !visited[nr][c] && board[nr][c] == '|'){
                dfs(nr, c);
            }
        }
    }
}
