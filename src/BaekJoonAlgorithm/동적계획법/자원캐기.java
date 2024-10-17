package BaekJoonAlgorithm.동적계획법;

import java.util.*;

public class 자원캐기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] board = new int[n+1][m+1];
        int[][] dp = new int[n+1][m+1];

        for (int i =1; i<=n;i++){
            for (int j =1; j<=m;j++){
                board[i][j]= sc.nextInt();
            }
        }

        for (int i =1; i<=n;i++){
            for (int j =1; j<=m;j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])+board[i][j];
            }
        }

        System.out.println(dp[n][m]);
    }
}
