package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_1788 {
    static final int MOD = 1_000_000_000;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println(0);
            System.out.println(0);
            return;
        }

        int absN = Math.abs(n);

        long[] dp = new long[absN + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= absN; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        int sign;

        if (n > 0) {
            sign = 1;
        } else {
            if (absN % 2 == 0) sign = -1;
            else sign = 1;
        }

        System.out.println(sign);
        System.out.println(dp[absN]);
    }
}
