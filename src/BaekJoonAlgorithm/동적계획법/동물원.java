package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1309
/**
 * 사자를 배치할수 있는 경우의 수는 총 3가지가 존재한다. 1.(왼쪽 O, 오른쪽 X) , 2.(왼쪽 X, 오른쪽 O) ,3.(왼쪽 X, 오른쪽 X) 3가지가 존재
 * == 점화식 ==
 * 2차원 배열에서 NONE, LEFT, RIGHT 상태를 생성해 경우의 수 도출
 * 
 * ---저장하지 않는 경우의수---
 *  dp[NONE][N] =  dp[RIGHT][N-1] + dp[LEFT][N-1|]  + dp[NONE][N-1]    -> 오른쪽에 사자를 배치하거나, 왼쪽에 사자를 배치하거나, 왼쪽 오른쪽 사지를 배치하지않은 경우를 저장
 *  
 * ---왼쪽에 사자를 저장하는 경우의수---
 *   dp[LEFT][N] =  dp[RIGHT][N-1] + dp[NONE][N-1] -> 오른쪽에 사자를 배치했거나, 둘다 배치를 하지않은 경우
 *   
 * ---오른쪽에 사자를 저장하는 경우의수---
 *  dp[RIGHT][N] = dp[LEFT][N-1] + dp[NONE][N-1]  -> 왼쪽에 사자를 배치했거나, 둘다 배치하지않은 경우
 *
 *  결과는 -> LEFT, RIGHT, NONE의 저장된 경우의수 를 모두 더하면 N 칸의 사자를 배치할수 있는 경우의수를 도출할수 있다.
 */
public class 동물원 {
    static final int NONE = 0;
    static final int LEFT = 1;
    static final int RIGHT = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mod = 9901;

        int[][] dp = new int[3][n+1];

        dp[NONE][1] = 1;
        dp[LEFT][1] = 1;
        dp[RIGHT][1] = 1;


        for(int i = 2;i<=n;i++){
            dp[LEFT][i] = (dp[RIGHT][i-1] + dp[NONE][i-1]) % mod;
            dp[RIGHT][i] = (dp[LEFT][i-1] + dp[NONE][i-1]) % mod;
            dp[NONE][i] = (dp[LEFT][i-1] + dp[RIGHT][i-1] + dp[NONE][i-1])% mod;
        }

        System.out.println((dp[NONE][n] + dp[RIGHT][n] + dp[LEFT][n])%mod);
    }
}
