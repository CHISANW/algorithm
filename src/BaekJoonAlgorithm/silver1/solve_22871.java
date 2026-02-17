package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_22871 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            a[i] = Long.parseLong(st.nextToken());
        }

        long INF = Long.MAX_VALUE / 4;
        long[] dp = new long[n];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for(int i =1; i<n;i++){
            long best = INF;
            for(int j =0; j<i;j++){
                long cost = (long)(i-j) * (1 + Math.abs(a[i] - a[j]));
                long need = Math.max(dp[j], cost);
                if(need < best) best = need;
            }

            dp[i] = best;
        }

        System.out.println(dp[n-1]);
    }
}
