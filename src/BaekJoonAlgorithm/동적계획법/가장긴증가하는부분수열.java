package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 가장긴증가하는부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i< n;i++){
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        int maxLength = 0;

        for(int i =0; i<n;i++){
            dp[i] = 1;
            for(int j = 0; j<i;j++){
                if(arr[i] > arr[j] && dp[i] < dp[j] +1){
                    dp[i]  = dp[j] + 1;
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        System.out.println(maxLength);
    }
}
