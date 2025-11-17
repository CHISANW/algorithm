package BaekJoonAlgorithm.silver5;

import java.util.Scanner;
import java.math.BigInteger;

public class solve_10826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger[] dp = new BigInteger[n + 1];

        dp[0] = BigInteger.ZERO;
        if (n > 0) dp[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        System.out.println(dp[n]);
    }
}
