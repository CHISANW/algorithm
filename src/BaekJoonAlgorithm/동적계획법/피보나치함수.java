package BaekJoonAlgorithm.동적계획법;

import java.io.*;

public class 피보나치함수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int[] dp0 = new int[41];
        int[] dp1 = new int[41];

        dp0[0] = 1; dp1[0] = 0;
        dp0[1] = 0; dp1[1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp0[i] = dp0[i - 1] + dp0[i - 2];
            dp1[i] = dp1[i - 1] + dp1[i - 2];
        }

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp0[n]).append(" ").append(dp1[n]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
