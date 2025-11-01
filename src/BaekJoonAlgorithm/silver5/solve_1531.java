package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1531 {
    public static void main(String[] args) {
        int[][] board = new int[101][101];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i =0; i<n; i++){
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            for (int r = r1; r <= r2; r++) {
                for (int c = c1; c <= c2; c++) {
                    board[r][c]++;
                }
            }
        }
        int ans = 0;
        for(int i =1; i<101; i++) {
            for (int j = 1; j < 101; j++) {
                if(board[i][j] > m){
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}
