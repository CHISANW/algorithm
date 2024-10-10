package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 징검다리건너기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        int[] dp = new int[n+1];

        for (int i =1;i<n;i++){
            int small = sc.nextInt();
            int large = sc.nextInt();
            arr[i][0] = small;
            arr[i][1] = large;
        }

        int k = sc.nextInt();

        if (n >= 2){
            dp[2] = arr[1][0];
        }
        if (n >=3){
            dp[3] = Math.min(dp[2]+arr[2][0], arr[1][1]);
        }

        int answer = Integer.MAX_VALUE;
        if (n>=4) {
            for (int i = 4; i <= n; i++) {
                for (int j = 4; j <= n; j++) {
                    if (i == j) {
                        dp[j] = dp[j - 3] + k;
                    } else {
                        dp[j] = Integer.MAX_VALUE;
                    }
                    dp[j] = Math.min(dp[j], Math.min(dp[j - 2] + arr[j - 2][1], dp[j - 1] + arr[j - 1][0]));
                }
                answer = Math.min(answer, dp[n]);
            }
        }else{
            answer = dp[n];
        }

        System.out.println(answer);
    }
}
