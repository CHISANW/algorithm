package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_11048 {
    static int[][] board;
    static int[][] dp;
    static int n, m;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n+1][m+1];
        dp = new int[n+1][m+1];

        for(int i =1; i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=m;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =1; i<=n;i++){
            for(int j=1; j<=m;j++){
                dp[i][j] = Math.max(dp[i-1][j], Math.max(dp[i][j-1], board[i-1][j-1]))+board[i][j];
            }
        }

        System.out.println(dp[n][m]);
    }


}
