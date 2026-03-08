package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_10164 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // K가 0이면 반드시 거쳐야 하는 칸이 없음
        if (K == 0) {
            System.out.println(countPath(1, 1, N, M));
            return;
        }

        // K번째 칸의 좌표 구하기 (1-indexed)
        int kRow = (K - 1) / M + 1;
        int kCol = (K - 1) % M + 1;

        // 시작 -> K, K -> 도착 경로 수를 곱한다
        int first = countPath(1, 1, kRow, kCol);
        int second = countPath(kRow, kCol, N, M);

        System.out.println(first * second);
    }

    // (sr, sc)에서 (er, ec)까지 오른쪽/아래쪽으로만 이동하는 경로 수
    static int countPath(int sr, int sc, int er, int ec) {
        int rows = er - sr + 1;
        int cols = ec - sc + 1;

        int[][] dp = new int[rows][cols];
        dp[0][0] = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 && j == 0) continue;

                if (i > 0) dp[i][j] += dp[i - 1][j];
                if (j > 0) dp[i][j] += dp[i][j - 1];
            }
        }

        return dp[rows - 1][cols - 1];
    }
}
