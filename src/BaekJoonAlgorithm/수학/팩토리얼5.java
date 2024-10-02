package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 팩토리얼5 {
    static long mod = (long) 1e12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] dp = new long[n + 1];

        long num;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] * i;

            while (dp[i] % 10 == 0){
                dp[i] /= 10;
            }
            dp[i] %= mod;
        }

        num = dp[n] % 100000;
        System.out.printf("%05d",num);
    }
}
