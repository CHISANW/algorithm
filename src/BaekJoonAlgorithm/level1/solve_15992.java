package BaekJoonAlgorithm.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_15992 {
    static final long MOD = 1_000_000_009L;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int[] ns = new int[t];
        int[] ks = new int[t];

        int maxN = 0, maxK = 0;
        for(int i =0; i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            ns[i] = n;
            ks[i] = k;
            if(n > maxN) maxN = n;
            if(k > maxK) maxK = k;
        }

        long[][] dp =new long[maxN+1][maxK+1];
        dp[0][0] = 1;

        for (int n = 1; n <= maxN; n++) {
            for (int k = 1; k <= maxK; k++) {
                long val = 0;
                if (n - 1 >= 0) val += dp[n - 1][k - 1];
                if (n - 2 >= 0) val += dp[n - 2][k - 1];
                if (n - 3 >= 0) val += dp[n - 3][k - 1];
                dp[n][k] = val % MOD;
            }
        }

        for (int i = 0; i < t; i++) {
            sb.append(dp[ns[i]][ks[i]]).append('\n');
        }

        System.out.print(sb.toString());
    }
}
