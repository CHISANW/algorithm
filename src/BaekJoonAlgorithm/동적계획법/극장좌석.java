package BaekJoonAlgorithm.동적계획법;

import java.util.*;

public class 극장좌석 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 좌석 수
        int m = sc.nextInt();   // vip

        int[] dp = new int[41];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        int ans =1;
        int vipSeat = 0;
        for (int i =0; i<m;i++){
            int temp = sc.nextInt();
            ans *= dp[temp-vipSeat-1];
            vipSeat = temp;
        }

        ans *= dp[n-vipSeat];

        System.out.println(ans);


    }
}
