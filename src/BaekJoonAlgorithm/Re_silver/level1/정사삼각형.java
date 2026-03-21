package BaekJoonAlgorithm.Re_silver.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 정사삼각형 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] arr = new int[n+1][n+1];


    for(int i =1; i<=n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j = 1; j<=i;j++){
        String s = st.nextToken();
        arr[i][j] = Integer.parseInt(s);
      }
    }

    int[][] dp = new int[n+1][n+1];

    dp[1][1] = arr[1][1];

    for(int i =2 ; i<=n;i++){
      for (int j = 1 ; j<=i;j++){

        dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
      }
    }


    int max =0;
    for(int i =1; i<=n;i++){
      max = Math.max(max, dp[n][i]);
    }

    System.out.println(max);
  }

}
