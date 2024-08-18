package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/15988
public class 더하기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int maxN = 1000000;
        int mod = 1000000009;

        long[] dp = new long[maxN + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= maxN; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % mod;
        }

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            sb.append(dp[n]).append("\n");
        }
        System.out.print(sb);
    }
}
