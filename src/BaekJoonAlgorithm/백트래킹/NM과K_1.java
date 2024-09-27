package BaekJoonAlgorithm.백트래킹;

import java.io.*;
import java.util.*;

public class NM과K_1 {
    static int[][] board;
    static int n, m, k;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int max = 0;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backTracking(0, 0);

        System.out.println(max);
    }

    static void backTracking(int depth, int sum) {
        if (depth == k) {
            max = Math.max(sum, max);
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j]) continue;

                boolean canVisit = true;
                for (int d = 0; d < 4; d++) {
                    int nr = i + dr[d];
                    int nc = j + dc[d];
                    if (isRange(nr, nc) && visited[nr][nc]) {
                        canVisit = false;
                        break;
                    }
                }

                if (!canVisit) continue;

                visited[i][j] = true;
                backTracking(depth + 1, sum + board[i][j]);
                visited[i][j] = false;
            }
        }
    }

    static boolean isRange(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < m;
    }
}
