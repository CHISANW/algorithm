package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

/**
 * 세 번 이내에 사과를 먹자[https://www.acmicpc.net/problem/26169]
 */
public class BaekJoon_26169 {
    static int[][] board = new int[5][5];
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int row = sc.nextInt();
        int col = sc.nextInt();

        boolean check = bfs(row, col);

        if (check) System.out.println(1);
        else System.out.println(0);
    }


    static boolean bfs(int row, int col) {
        Queue<Point> q = new LinkedList<>();
        int[][] copyBoard = new int[5][5];
        for(int i = 0; i < 5; i++) {
            copyBoard[i] = board[i].clone();
        }

        int appleCount = 0;
        if (copyBoard[row][col] == 1) {
            appleCount++;
        }

        q.add(new Point(row, col, 0, appleCount, copyBoard));

        while (!q.isEmpty()) {
            Point now = q.poll();
            if (now.distance == 3 && now.apple >= 2) {
                return true;
            }
            if (now.distance >= 3) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nr = now.row + dr[i];
                int nc = now.col + dc[i];

                if (!isRange(nr, nc)) continue;
                if (now.board[nr][nc] != -1) {
                    int[][] newBoard = new int[5][5];
                    for(int j = 0; j < 5; j++) {
                        newBoard[j] = now.board[j].clone();
                    }
                    newBoard[now.row][now.col] = -1;

                    int newApple = now.apple;
                    if (newBoard[nr][nc] == 1) {
                        newApple++;
                    }

                    q.add(new Point(nr, nc, now.distance + 1, newApple, newBoard));
                }
            }
        }
        return false;
    }

    public static boolean isRange(int row, int col) {
        return row >= 0 && row < 5 && col >= 0 && col < 5;
    }

    static class Point {
        int row;
        int col;
        int distance;
        int apple;
        int[][] board;

        public Point(int row, int col, int distance, int apple, int[][] board) {
            this.row = row;
            this.col = col;
            this.distance = distance;
            this.apple = apple;
            this.board = board;
        }
    }
}
