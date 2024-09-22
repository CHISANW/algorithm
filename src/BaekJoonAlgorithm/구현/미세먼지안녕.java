package BaekJoonAlgorithm.구현;

import java.util.*;

public class 미세먼지안녕 {
    static int[][] board;
    static int r, c, t;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static List<Point> con = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt(); // 행
        c = sc.nextInt(); // 열
        t = sc.nextInt(); // 경과 시간

        board = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == -1) {
                    con.add(new Point(i, j));
                }
            }
        }

        for (int i = 0; i < t; i++) {
            fillBoard();
            move();
        }

        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] != -1) {
                    sum += board[i][j];
                }
            }
        }

        System.out.println(sum);
    }

    static void move() {
        int upperCleaner = con.get(0).r; // 위쪽 공기청정기
        int lowerCleaner = con.get(1).r; // 아래쪽 공기청정기

        // (1) 위에서 아래로
        for (int i = upperCleaner - 1; i > 0; i--) {
            board[i][0] = board[i - 1][0];
        }
        // (2) 왼쪽에서 오른쪽으로
        for (int j = 0; j < c - 1; j++) {
            board[0][j] = board[0][j + 1];
        }
        // (3) 아래에서 위로
        for (int i = 0; i < upperCleaner; i++) {
            board[i][c - 1] = board[i + 1][c - 1];
        }
        // (4) 오른쪽에서 왼쪽으로
        for (int j = c - 1; j > 1; j--) {
            board[upperCleaner][j] = board[upperCleaner][j - 1];
        }
        // (5) 공기청정기 위치에는 미세먼지가 없어야 함
        board[upperCleaner][1] = 0;

        // 아래쪽 공기청정기에서의 미세먼지 이동 (시계 방향)
        // (1) 아래에서 위로
        for (int i = lowerCleaner + 1; i < r - 1; i++) {
            board[i][0] = board[i + 1][0];
        }
        // (2) 왼쪽에서 오른쪽으로
        for (int j = 0; j < c - 1; j++) {
            board[r - 1][j] = board[r - 1][j + 1];
        }
        // (3) 위에서 아래로
        for (int i = r - 1; i > lowerCleaner; i--) {
            board[i][c - 1] = board[i - 1][c - 1];
        }
        // (4) 오른쪽에서 왼쪽으로
        for (int j = c - 1; j > 1; j--) {
            board[lowerCleaner][j] = board[lowerCleaner][j - 1];
        }
        // (5) 공기청정기 위치에는 미세먼지가 없어야 함
        board[lowerCleaner][1] = 0;
    }

    static void fillBoard() {
        int[][] tempBoard = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == -1) continue;
                int div = board[i][j] / 5;
                int count = 0;

                for (int k = 0; k < 4; k++) {
                    int nr = i + dr[k];
                    int nc = j + dc[k];

                    if (isRange(nr, nc) && board[nr][nc] != -1) {
                        tempBoard[nr][nc] += div; // 확산된 양 추가
                        count++;
                    }
                }
                tempBoard[i][j] -= (div * count); // 남는 양 계산
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                board[i][j] += tempBoard[i][j];
            }
        }
    }

    static boolean isRange(int row, int col) {
        return row >= 0 && row < r && col >= 0 && col < c;
    }

    static class Point {
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
