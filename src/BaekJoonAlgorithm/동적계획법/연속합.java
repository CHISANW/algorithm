package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 연속합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int[] arr =new int[n];
        int[] dp = new int[n];

        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        int maxSum = dp[0];

        for (int i = 1; i<n;i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            if (maxSum< dp[i]){
                maxSum = dp[i];
            }
        }

        System.out.println(maxSum);
    }
}
