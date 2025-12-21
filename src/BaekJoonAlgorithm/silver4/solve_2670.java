package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_2670 {
    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] dp = new double[n];

        dp[0] = Double.parseDouble(br.readLine());
        double answer = dp[0];

        for(int i =1; i<n;i++){
            double cur = Double.parseDouble(br.readLine());
            dp[i] = Math.max(cur, cur * dp[i-1]);
            answer = Math.max(answer, dp[i]);
        }

        System.out.printf("%.3f\n",answer);
    }

}
