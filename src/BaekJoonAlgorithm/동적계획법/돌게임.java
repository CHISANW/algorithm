package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 돌게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] dp = new String[1000];

        dp[0] = "SK";
        dp[1] = "CY";
        dp[2] = "SK";

        for (int i =3;i<n;i++){
            int value = i/3 + i%3;
            dp[i] =  dp[value];
        }

        System.out.println(dp[n-1]);
    }
}
