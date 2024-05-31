package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2294
public class 동전2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[n];
        int[] dp = new int[k+1];

        for(int i = 1;i<=k;i++){
            dp[i] = 100001;
        }

        for(int i = 0; i<n;i++){
            coin[i] = sc.nextInt();
            if(coin[i] <= k)
                dp[coin[i]] = 1;
        }

        for(int i = 1;i<=k;i++){
            for (int j =0 ;j<n;j++){
                if(i+coin[j] <= k){
                    dp[i+coin[j]] = Math.min(dp[i+coin[j]],dp[i]+1);
                }
            }
        }

        if (dp[k] == 100001){
            System.out.println(-1);
        }else
            System.out.println(dp[k]);
    }
}
