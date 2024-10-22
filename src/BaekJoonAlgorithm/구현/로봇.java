package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 로봇 {
    static int r, c;
    static int[][] board;
    static boolean[][] visited;
    static int[] dr = new int[4];
    static int[] dc = new int[4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();

        board = new int[r][c];
        visited = new boolean[r][c];

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            board[row][col] = 1;
        }

        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            checkRange(sc.nextInt(), i);
        }

        int index = 0;
        while (!checkFourRange(row, col)) {

            int nR = dr[index % 4] + row;
            int nC = dc[index % 4] + col;

            if (!isRange(nR, nC) || visited[nR][nC] || board[nR][nC] == 1) {
                index++;
                continue;
            }

            visited[row][col] = true;
            row = nR;
            col = nC;
        }

        System.out.println(row+" "+col);
    }

    static boolean checkFourRange(int row, int col) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nr = dr[i] + row;
            int nc = dc[i] + col;
            if (!isRange(nr, nc) || board[nr][nc] == 1 || visited[nr][nc]) {
                count++;
            }
        }
        return count == 4;
    }

    static boolean isRange(int row, int col) {
        return row >= 0 && row < r && col >= 0 && col < c;
    }

    static void checkRange(int value, int index) {
        switch (value) {
            case 1:
                dr[index] = -1;
                dc[index] = 0;
                break;
            case 2:
                dr[index] = 1;
                dc[index] = 0;
                break;
            case 3:
                dr[index] = 0;
                dc[index] = -1;
                break;
            case 4:
                dr[index] = 0;
                dc[index] = 1;
                break;
            }
        }

}
