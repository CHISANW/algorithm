package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class FourSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[1] = 1;

        int min = 0;
        for(int i=2 ;i<=n;i++){
            min = Integer.MAX_VALUE;
            for(int j = 1; j*j<=i;j++){
                int temp = i - j*j;
                min = Math.min(dp[temp], min);
            }
            dp[i] = min+1;
        }
        System.out.println(dp[n]);
    }
}
