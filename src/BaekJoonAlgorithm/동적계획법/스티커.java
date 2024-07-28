package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 스티커 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[][] sticker = new int[2][n];
            for(int i =0; i<2;i++){
                for(int j =0; j<n;j++) {
                    sticker[i][j] = sc.nextInt();
                }
            }

            if (n == 1) {
                System.out.println(Math.max(sticker[0][0], sticker[1][0]));
                continue;
            }

            int[][] dp = new int[2][n];
            dp[0][0] = sticker[0][0];
            dp[1][0] = sticker[1][0];
            dp[0][1] = sticker[0][1] + dp[1][0];
            dp[1][1] = sticker[1][1] + dp[0][0];

            for(int j= 2; j<n;j++){
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + sticker[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + sticker[1][j];
            }

            System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
        }
    }
}
