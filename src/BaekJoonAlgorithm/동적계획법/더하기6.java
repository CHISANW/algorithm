package BaekJoonAlgorithm.동적계획법;

import java.io.*;

public class 더하기6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        long[] dp = new long[100001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 2;
        dp[4] = 3;
        dp[5] = 3;
        dp[6] = 6;

        for (int i =7;i<100001;i++){
            dp[i] = (dp[i-2] + dp[i-4] + dp[i-6]) % 1_000_000_009;
        }

        while (t-- > 0){
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);

    }
}
