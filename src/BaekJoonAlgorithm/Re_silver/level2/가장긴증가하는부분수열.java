package BaekJoonAlgorithm.Re_silver.level2;

import java.util.Scanner;

public class 가장긴증가하는부분수열 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n + 1];
    int[] dp = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }

    int answer = 0;

    for (int i = 1; i <= n; i++) {
      dp[i] = 1; // 자기 자신만 선택

      for (int j = 1; j < i; j++) {
        if (arr[j] < arr[i]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }

      answer = Math.max(answer, dp[i]);
    }

    System.out.println(answer);
  }
}
