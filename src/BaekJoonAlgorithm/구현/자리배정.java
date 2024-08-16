package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 자리배정 {
    // 상, 우, 아, 좌
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int C, R;
    static boolean[][] visited;
    static int[][] board;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        R = sc.nextInt();

        int K = sc.nextInt();

        if (C * R < K){
            System.out.println(0);
            System.exit(0);
        }

        board = new int[C][R];
        visited = new boolean[C][R];


        int value = 1;

        int r = 0;
        int c = 0;
        int nd = 0;
        int nr= 0 , nc =0;
        while (value < K){
            board[r][c] = value;
            visited[r][c] = true;
            nr = r + dr[nd];
            nc = c + dc[nd];
            if (nr>=R || nr <0 || nc>= C || nc< 0 || visited[nr][nc]){
                nd = (nd+1)%4;
                nr = r + dr[nd];
                nc = c + dc[nd];
            }

            r= nr;
            c= nc;
            value++;
        }
        System.out.println((r+1) + " "+(c+1));
    }

}
