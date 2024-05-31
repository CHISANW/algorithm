package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 평범한배낭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 물품수
        int k = sc.nextInt();       // 버틸수있는 무게

        int[] dp = new int[k+1];
        for(int i=0; i<n;i++){
            int w = sc.nextInt();       // 물건 무게
            int v = sc.nextInt();       // 무게 가치

            for(int j = k; j>=w;j--){
                dp[j] = Math.max(dp[j], dp[j-w]+v);
            }
        }
        System.out.println(dp[k]);
    }
}
