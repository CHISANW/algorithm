package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 이친수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[91];

        dp[1] = 1;
        dp[2] = 1;

        for(int i=3;i<91;i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
