package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_15993 {
    static int mod = 1000000009;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] dp = new int[100001][2];

        dp[1][0] = 0;
        dp[1][1] = 1;

        dp[2][0] = 1;
        dp[2][1] = 1;

        dp[3][0] = 2;
        dp[3][1] = 2;

        for(int i = 4;i<=100000;i++){
            dp[i][0] = (dp[i-1][1] + dp[i-2][1] + dp[i-3][1]) % mod;
            dp[i][1] = (dp[i-1][0] + dp[i-2][0] + dp[i-3][0]) % mod;
        }

        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n][1]).append(" ").append(dp[n][01]).append("\n");
        }

        System.out.println(sb.toString());

    }
}
