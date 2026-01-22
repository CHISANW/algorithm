package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_22342 {
    static int M, N;
    static int[][] weight;
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        weight = new int[M][N];
        dp = new int[M][N];

        // 입력
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                weight[i][j] = line.charAt(j) - '0';
            }
        }

        // 첫 열 초기화
        for (int i = 0; i < M; i++) {
            dp[i][0] = weight[i][0];
        }

        int answer = 0;

        // DP
        for (int j = 1; j < N; j++) {
            for (int i = 0; i < M; i++) {

                int maxPrev = dp[i][j - 1];

                if (i > 0)
                    maxPrev = Math.max(maxPrev, dp[i - 1][j - 1]);
                if (i < M - 1)
                    maxPrev = Math.max(maxPrev, dp[i + 1][j - 1]);

                dp[i][j] = maxPrev + weight[i][j];
                answer = Math.max(answer, maxPrev);
            }
        }

        System.out.println(answer);
    }
}
