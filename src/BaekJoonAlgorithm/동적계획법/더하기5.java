package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 더하기5 {
    static final int MOD =1000000009;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        long[][] dp = new long[100001][4];
        long[] answer = new long[t];
        int index = 0;



        dp[1][1] = 1; // 1
        dp[2][2] = 1; // 2
        dp[3][1] = 1; // 2+1
        dp[3][2] = 1; // 1+2
        dp[3][3] = 1; // 3;

        for(int i = 4; i<=100000;i++){
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % MOD;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % MOD;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % MOD;
        }

        while (t-- > 0){
            int n = sc.nextInt();
            answer[index++] = ((dp[n][1] + dp[n][2]+ dp[n][3]) % MOD);
        }

        for (long ans : answer) {
            System.out.println(ans);
        }
    }
}
