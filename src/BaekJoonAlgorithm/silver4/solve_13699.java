package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_13699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n+1];

        dp[0] =1;
        for (int i = 1; i <=n ; i++) {
            dp[i]=0;
            for (int j = 0; j<i;j++){
                dp[i] += dp[j] * dp[i-1-j];
            }
        }

        System.out.println(dp[n]);
    }
}
