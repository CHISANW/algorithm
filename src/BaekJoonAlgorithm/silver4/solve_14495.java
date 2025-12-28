package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_14495 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[117];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for(int i = 4; i<=n;i++){
            dp[i] = dp[i-1] + dp[i-3];
        }
        System.out.println(dp[n]);
    }
}
