package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2293
/**
 * {1,2}를 사용하는 경우를 예로들면
 * 상향식 방법으로 풀이
 * 동전 1을 사용하는 경우:
 *
 * j = 0: dp[0 + 1] += dp[0] => dp[1] += 1 => dp = [1, 1, 0, 0, 0]
 * j = 1: dp[1 + 1] += dp[1] => dp[2] += 1 => dp = [1, 1, 1, 0, 0]
 * j = 2: dp[2 + 1] += dp[2] => dp[3] += 1 => dp = [1, 1, 1, 1, 0]
 * j = 3: dp[3 + 1] += dp[3] => dp[4] += 1 => dp = [1, 1, 1, 1, 1]
 * 동전 2를 사용하는 경우:
 *
 * j = 0: dp[0 + 2] += dp[0] => dp[2] += 1 => dp = [1, 1, 2, 1, 1]
 * j = 1: dp[1 + 2] += dp[1] => dp[3] += 1 => dp = [1, 1, 2, 2, 1]
 * j = 2: dp[2 + 2] += dp[2] => dp[4] += 2 => dp = [1, 1, 2, 2, 3]
 * j = 3: 해당 없음 (이미 j + coin[i] > k)
 *
 * 즉 답은 마지막 dp[4]=3 이된다.
 */
public class 동전1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[n];
        int[] dp = new int[k+1];

        for(int i =0;i<n;i++){
            coin[i] = sc.nextInt();
        }

        dp[0] = 1;
        for(int i =0 ;i<n;i++){
            for(int j = 0; j+coin[i]<=k;j++){
                dp[j+coin[i]] += dp[j];
            }
        }
        System.out.println(dp[k]);
    }

}
