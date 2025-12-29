package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_14606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i =2; i<=n;i++){
            for(int k =1; k<i;k++){
                dp[i] = Math.max(dp[i], dp[k] + dp[i-k] + (long) k * (i-k));
            }
        }
        System.out.println(dp[n]);
    }
}
