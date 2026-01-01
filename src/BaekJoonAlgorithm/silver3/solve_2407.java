package BaekJoonAlgorithm.silver3;

import java.math.BigInteger;
import java.util.Scanner;

public class solve_2407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BigInteger[][] dp = new BigInteger[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = BigInteger.ZERO;
            }
        }

        for (int i = 0; i <= n; i++) {
            dp[i][0] = BigInteger.ONE;
            dp[i][i] = BigInteger.ONE;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1].add(dp[i - 1][j]);
            }
        }

        System.out.println(dp[n][m]);
    }
}
