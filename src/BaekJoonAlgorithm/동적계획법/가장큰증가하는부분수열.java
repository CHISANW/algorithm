package BaekJoonAlgorithm.동적계획법;

import java.util.*;

public class 가장큰증가하는부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxValue = 0;

        for(int i =0; i<n;i++){
            dp[i] = arr[i];

            for(int j =0; j<i;j++){
                if (arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]+arr[i]);
                }
            }

            maxValue = Math.max(dp[i],maxValue);
        }

        System.out.println(maxValue);
    }
}
