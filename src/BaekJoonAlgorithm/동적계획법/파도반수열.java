package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 파도반수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        Long[] dp = new Long[101];

        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
