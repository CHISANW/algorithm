package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 기타리스트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int[] v = new int[n];

        for (int i =0;i<n;i++){
            v[i] = sc.nextInt();
        }
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][s] = true;

        for (int i =0; i<n;i++){
            for (int j =0; j<=m;j++){
                if (dp[i][j]){
                    if (j + v[i]<=m){
                        dp[i+1][j+v[i]] = true;
                    }
                    if (j-v[i] >=0){
                        dp[i+1][j-v[i]] =true;
                    }
                }
            }
        }

        int max = -1;

        for (int j =0; j<=m;j++){
            if (dp[n][j]){
                max = j;
            }
        }
        System.out.println(max);

    }
}
