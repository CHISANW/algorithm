package BaekJoonAlgorithm.재귀호출;

import java.util.*;

public class 팬린드롬파티션 {
    static int max = 1000;
    static int[] dp = new int[max+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        dp();

        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }

    static void dp(){
        dp[1] = 1;
        for (int i = 2; i<=max;i++){
            if (i % 2 == 0) {
                dp[i] = dp[i - 1] + dp[i / 2];
            }else{
                dp[i] = dp[i-1];
            }
        }

    }
}
