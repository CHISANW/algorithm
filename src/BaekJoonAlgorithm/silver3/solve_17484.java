package BaekJoonAlgorithm.silver3;

import java.util.Arrays;
import java.util.Scanner;

public class solve_17484 {
    static final int INF = 1_000_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n + 1][m + 2];

        // d = 0(좌하), 1(하), 2(우하)
        int[][][] dp = new int[n + 1][m + 2][3];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m + 1; j++) {
                Arrays.fill(dp[i][j], INF);
            }
        }

        for (int j = 1; j <= m; j++) {
            dp[1][j][0] = arr[1][j];
            dp[1][j][1] = arr[1][j];
            dp[1][j][2] = arr[1][j];
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                // 좌하 ↙
                if (j - 1 >= 1) {
                    dp[i][j][0] =
                            Math.min(dp[i - 1][j - 1][1], dp[i - 1][j - 1][2])
                                    + arr[i][j];
                }

                // 하 ↓
                dp[i][j][1] =
                        Math.min(dp[i - 1][j][0], dp[i - 1][j][2])
                                + arr[i][j];

                // 우하 ↘
                if (j + 1 <= m) {
                    dp[i][j][2] =
                            Math.min(dp[i - 1][j + 1][0], dp[i - 1][j + 1][1])
                                    + arr[i][j];
                }
            }
        }

        int answer = INF;
        for (int j = 1; j <= m; j++) {
            for (int d = 0; d < 3; d++) {
                answer = Math.min(answer, dp[n][j][d]);
            }
        }

        System.out.println(answer);
    }
}
