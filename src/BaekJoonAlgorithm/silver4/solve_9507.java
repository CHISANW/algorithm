package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_9507 {
    static long[] dp = new long[70];
    public static void main(String[] args) {

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 4; i<=69;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];
        }
        while (t-- > 0 ){
            int n = sc.nextInt();
            System.out.println(dp[n]);

        }
    }

}
