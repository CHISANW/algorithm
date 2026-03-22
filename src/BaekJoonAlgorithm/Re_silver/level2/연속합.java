package BaekJoonAlgorithm.Re_silver.level2;

import java.io.*;
import java.util.StringTokenizer;

public class 연속합 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[n+1];
    int[] dp = new int[n+1];

    for(int i = 1; i<=n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    dp[1] = arr[1];

    int ans = dp[1];

    for(int i = 2; i<=n; i++){
      dp[i] = Math.max(dp[i-1] + arr[i] , arr[i]);
      ans = Math.max(ans, dp[i]);
    }

    System.out.println(ans);
  }
}
