package BaekJoonAlgorithm.그래프;

import java.util.Scanner;

public class 비밀번호 {
    static final int MOD = 1234567;
    static final int[][] adj = {
            {7},
            {2, 4},
            {1, 3, 5},
            {2, 6},
            {1, 5, 7},
            {2, 4, 6, 8},
            {3, 5, 9},
            {4, 8, 0},
            {5, 7, 9},
            {6, 8}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[][] dp = new int[10001][10];
        for (int i =0;i<10;i++){
            dp[1][i] =1;
        }

        for (int len = 2;len<=1000;len++){
            for (int i =0;i<10;i++){
                dp[len][i] = 0;
                for(int next : adj[i]){
                    dp[len][i] = (dp[len][i] + dp[len-1][next]) % MOD;
                }
            }
        }

        while (T-- > 0) {
            int N = sc.nextInt();

            int result = 0;
            for (int i = 0; i <= 9; i++) {
                result = (result + dp[N][i]) % MOD;
            }

            System.out.println(result);
        }
    }
}