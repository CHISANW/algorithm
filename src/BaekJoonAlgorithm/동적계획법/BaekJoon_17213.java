package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class BaekJoon_17213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] dp = new int[11][31];

        for (int i = 1; i <= m; i++) {
            dp[1][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            dp[i][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
            }
        }
        System.out.println(dp[n][m]);
    }
}
