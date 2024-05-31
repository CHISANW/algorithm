package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2156
/**
 * 연속으로 값을 3가지의 종류의 잔을 마실수가 없다 그래서 [0][n] 한잔도 안마시는 경우의수 , [1][n] 한잔만 마시는 경우의수, [2][n] 두잔연속으로 마시는 경우의 수를 구해 최댓값을 구하면 된다.
 */
public class 포도주시식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] wine = new int[n+1];
        int[][] dp = new int[3][n+1];

        for(int i = 1;i<=n;i++){
            wine[i] = sc.nextInt();
        }

        // 앞에 부분은 도출해내야 하는 부분
        dp[0][1] = 0;       // 아무것도 마시지 않는 경우의수
        dp[1][1] = wine[1]; // 첫잔이기때문에 처음잔(하나만 마신경우)
        dp[2][1] = wine[1]; // 총 잔이 1잔이기때문에 첫번째잔을 선택(두잔모두 마신경우)

        for(int i = 2;i<=n;i++){
            dp[0][i] = Math.max(dp[0][i-1], Math.max(dp[1][i-1], dp[2][i-1]));      // 아무것도 마시지않은경우이니 최댓값을 도출
            dp[1][i] = dp[0][i-1] + wine[i];        // 한잔을 마시는 경우이기 때문에 아무것도 마사지않은 n-1과 현재 잔은 값을 더함
            dp[2][i] = dp[1][i-1] + wine[i];        // 한잔을 마시는 경우의 수는 [1][n-1] 위치이며 현재 한잔을 도하면 총 두잔을 연속으로 먹은 경우의 수
        }

        System.out.println(Math.max(dp[0][n],Math.max(dp[1][n],dp[2][n])));
    }
}
