package BaekJoonAlgorithm.구현;

import java.io.*;
import java.util.*;

public class 체스 {
    static int[] qr = {-1, 1, 0, 0, 1, 1, -1, -1};  //상 하 좌 우 상좌 상우 하우 하좌
    static int[] qc = {0, 0, -1, 1, -1, 1, 1, -1};
    static int[] kr = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] kc = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[][] chess;
    static int n,m;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        chess = new int[n][m];

         /*
        1 = Q(퀸)
        2 = k(나이트)
        3 = P(폰)
         */
        st = new StringTokenizer(br.readLine());
        st.nextToken();

        fillChess(st,1); // 퀸

        st = new StringTokenizer(br.readLine());
        st.nextToken();
       fillChess(st,2); // 나이트

        st = new StringTokenizer(br.readLine());
        st.nextToken();
        fillChess(st,3); // 폰

        for (int i =0; i<n;i++){
            for (int j =0;j<m;j++){
                if (chess[i][j] != 0){
                    move(i,j,chess[i][j]);
                }
            }
        }


        int count = 0;
        for (int i =0; i<n;i++){
            for (int j =0; j<m;j++){
                if (chess[i][j]== 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    static void move(int row, int col, int value){
        if (value == 1){
            for (int i = 0; i < 8; i++) {
                int nr = row + qr[i];
                int nc = col + qc[i];
                while (isRange(nr, nc)) {
                    if (chess[nr][nc] == 1 || chess[nr][nc] == 2 || chess[nr][nc] == 3) {
                        break;
                    }
                    if (chess[nr][nc] == 0) {
                        chess[nr][nc] = 4;
                    }
                    nr += qr[i];
                    nc += qc[i];
                }
            }
        }else if (value == 2){
            for (int i =0; i<8;i++){
                int nr = row + kr[i];
                int nc = col + kc[i];
                if (isRange(nr, nc) && chess[nr][nc] == 0) {
                    chess[nr][nc] = 4;
                }
            }
        }
    }

    static boolean isRange(int row , int col){
        return row>=0 && row<n && col>=0 && col<m;
    }

    private static void fillChess(StringTokenizer st,int chessValue) {
        while (st.hasMoreTokens()){
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            chess[row-1][col-1] = chessValue;
        }
    }
}
