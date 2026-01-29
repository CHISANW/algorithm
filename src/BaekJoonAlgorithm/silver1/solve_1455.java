package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_1455 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }

        int count = 0;
        for(int i = n -1; i>=0; i--){
            for(int j = m-1; j>=0; j--){
                if(board[i][j] == 1){
                    flip(board, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    static void flip(int[][] board, int x, int y){
        for(int i= 0; i<=x;i++){
            for(int j=0; j<=y;j++){
                board[i][j] = 1 - board[i][j];
            }
        }
    }
}
