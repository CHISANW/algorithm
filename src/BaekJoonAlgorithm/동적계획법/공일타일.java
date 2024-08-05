package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 공일타일 {
    static final int MOD = 15746;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] dp = new long[n + 1];

        if (n == 1){
            System.out.println(1);
            return;
        }

        dp[1] = 1;
        dp[2] = 2;


        for(int i=3; i<= n;i++){
            dp[i] = (dp[i-1]+ dp[i-2]) % MOD;
        }

        System.out.println(dp[n]);
    }
}
