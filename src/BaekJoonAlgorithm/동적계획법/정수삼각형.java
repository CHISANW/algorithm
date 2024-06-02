package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1932
public class 정수삼각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] dp = new int[n+1][n+1];
        int[][] a =  new int[n+1][n+1];

        for(int i =1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                a[i][j] = sc.nextInt();
            }
        }

        dp[1][1] = a[1][1];

        for(int i= 2; i<=n;i++){
            for(int j = 1;j<=i;j++){
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + a[i][j];
            }
        }

        int max = 0;
        for (int i =1;i<=n;i++){
            max=  Math.max(max, dp[n][i]);
        }
        System.out.println(max);
    }
}
