package BaekJoonAlgorithm.동적계획법;

import java.util.*;

public class BaekJoon_16493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m + 1][2];
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            int day = sc.nextInt();
            int page = sc.nextInt();

            arr[i][0] = day;
            arr[i][1] = page;
        }

        for (int i = 1; i <= m; i++) {
            int day = arr[i][0];
            int page = arr[i][1];

            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j];
                if ((j - day) >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - day] + page);
                }
            }
        }

        System.out.println(dp[m][n]);

    }
}
