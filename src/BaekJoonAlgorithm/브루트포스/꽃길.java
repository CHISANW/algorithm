package BaekJoonAlgorithm.브루트포스;

import java.util.Scanner;

public class 꽃길 {
    static int[][] board;
    static int n;
    static int ans = Integer.MAX_VALUE;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0);
        System.out.println(ans);
    }

    static void dfs(int depth, int sum) {
        if (depth == 3) {
            ans = Math.min(sum, ans);
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (isRange(i, j) && canPlaceFlower(i, j)) {
                    int sums = getSum(i, j);
                    checkFlower(i, j, true);
                    dfs(depth + 1, sums + sum);
                    checkFlower(i, j, false);
                }
            }
        }
    }

    static void checkFlower(int r, int y, boolean check) {
        visited[r][y] = check;
        for (int i = 0; i < 4; i++) {
            int nx = r + dx[i];
            int ny = y + dy[i];
            visited[nx][ny] = check;
        }
    }

    static int getSum(int r, int y) {
        int sum = board[r][y];
        for (int i = 0; i < 4; i++) {
            int nx = r + dx[i];
            int ny = y + dy[i];
            sum += board[nx][ny];
        }
        return sum;
    }

    static boolean isRange(int r, int c) {
        return r >= 2 && r < n && c >= 2 && c < n;
    }

    static boolean canPlaceFlower(int r, int c) {
        if (visited[r][c]) return false;
        for (int i = 0; i < 4; i++) {
            int nx = r + dx[i];
            int ny = c + dy[i];
            if (visited[nx][ny]) return false;
        }
        return true;
    }
}
