package BaekJoonAlgorithm.동적계획법;

import java.util.*;

public class 병사배치하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for (int i =1; i<=n;i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 1; i<=n;i++){
            dp[i] = 1;

            for (int j =1;j<=i;j++){
                if (arr[j]>arr[i] && dp[i] < dp[j]+1){
                    dp[i] = dp[j] + 1;
                }
            }
            result = Math.max(result,dp[i]);
        }

        System.out.println(n - result);
    }
}
