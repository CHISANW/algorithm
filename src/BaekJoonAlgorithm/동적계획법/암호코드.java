package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 암호코드 {
    static final int MOD = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        int length = line.length();

        int[] dp = new int[length + 1];
        dp[0] = 1;

        for (int i = 1; i <= length; i++) {
            int currentDigit = line.charAt(i - 1) - '0';

            if (currentDigit >= 1 && currentDigit <= 9) {
                dp[i] = dp[i - 1];
            }

            if (i > 1) {
                int twoDigit = (line.charAt(i - 2) - '0') * 10 + currentDigit;
                if (twoDigit >= 10 && twoDigit <= 26) {
                    dp[i] = (dp[i] + dp[i - 2]) % MOD;
                }
            }

            if (dp[i] == 0) {
                System.out.println(0);
                return;
            }
        }


        System.out.println(dp[length]);
    }
}
