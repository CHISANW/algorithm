package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 돌게임3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] dp = new String[1001];
        dp[1] = "SK";
        dp[2] = "CY";
        dp[3] = "SK";
        dp[4] = "SK";

        for (int i =5;i<=n;i++){
            if (dp[i-1].equals("CY") || dp[i-3].equals("CY")|| dp[i-4].equals("CY"))
                dp[i] = "SK";
            else
                dp[i] = "CY";
        }
        System.out.println(dp[n]);
    }
}
