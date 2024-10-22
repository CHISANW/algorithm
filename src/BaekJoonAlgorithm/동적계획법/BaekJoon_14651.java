package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class BaekJoon_14651 {
    static long[][] dp;
    static int n;
    static final int MOD = 1000000009;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new long[n + 1][3];

        dp[1][1] = 1;
        dp[1][2] = 1;

        for (int length = 2; length <= n; length++) {
            for (int mod = 0; mod < 3; mod++) {
                dp[length][mod % 3] = (dp[length][mod % 3] + dp[length - 1][mod]) % MOD;
                dp[length][(mod + 1) % 3] = (dp[length][(mod + 1) % 3] + dp[length - 1][mod]) % MOD;
                dp[length][(mod + 2) % 3] = (dp[length][(mod + 2) % 3] + dp[length - 1][mod]) % MOD;
            }
        }

        System.out.println(dp[n][0]);
    }
}
