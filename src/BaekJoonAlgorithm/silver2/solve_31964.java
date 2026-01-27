package BaekJoonAlgorithm.silver2;

import java.io.*;
import java.util.*;

public class solve_31964 {
    static final long INF = Long.MAX_VALUE / 4;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] X = new long[N + 1];
        long[] T = new long[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) X[i] = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) T[i] = Long.parseLong(st.nextToken());

        long[][][] dp = new long[N + 2][N + 2][2];
        for (int i = 0; i <= N + 1; i++)
            for (int j = 0; j <= N + 1; j++)
                Arrays.fill(dp[i][j], INF);

        // 초기 상태
        for (int i = 1; i <= N; i++) {
            long startTime = Math.max(T[i], X[i]);
            dp[i][i][0] = startTime;
            dp[i][i][1] = startTime;
        }

        // 구간 길이 증가
        for (int len = 1; len <= N; len++) {
            for (int l = 1; l + len - 1 <= N; l++) {
                int r = l + len - 1;

                // 왼쪽 확장
                if (l > 1) {
                    long toLeftFromL = dp[l][r][0] + (X[l] - X[l - 1]);
                    long toLeftFromR = dp[l][r][1] + (X[r] - X[l - 1]);
                    long best = Math.min(toLeftFromL, toLeftFromR);
                    dp[l - 1][r][0] = Math.min(
                            dp[l - 1][r][0],
                            Math.max(best, T[l - 1])
                    );
                }

                // 오른쪽 확장
                if (r < N) {
                    long toRightFromL = dp[l][r][0] + (X[r + 1] - X[l]);
                    long toRightFromR = dp[l][r][1] + (X[r + 1] - X[r]);
                    long best = Math.min(toRightFromL, toRightFromR);
                    dp[l][r + 1][1] = Math.min(
                            dp[l][r + 1][1],
                            Math.max(best, T[r + 1])
                    );
                }
            }
        }

        long answer = Math.min(
                dp[1][N][0] + X[1],
                dp[1][N][1] + X[N]
        );

        System.out.println(answer);
    }
}
