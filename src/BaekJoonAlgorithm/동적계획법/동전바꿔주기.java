package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2624
public class 동전바꿔주기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();       // 지폐 금액
        int k = sc.nextInt();       // 동전 가짓 수

         /*
            dp[동전의 개수][만들수 있는 지폐 금액]
         */
        int[][] dp = new int[k+1][t+1];
        dp[0][0] = 1; // 아무 동전도 가지지 않는 경우의 수도 하나있다.

        // k= 동전갯수이므로 k개의 동전으로 만들수있는 경우의수 조회
        for(int i = 1;i<=k;i++){
            int coinPrice = sc.nextInt();       // 동전 금액
            int coinCount = sc.nextInt();        // 동전 개수

            for(int value = 0; value <= t; value++){        //현재 금액
                for(int cnt = 0; cnt<= coinCount;cnt++){     // 동전의 개수
                    int nextValue = value + coinPrice*cnt;      // 현재 금액 + 동전 가격 * 갯수
                    if(nextValue > t) break;    // k개의 범위 내에서 동전들의 합을 구함
                    /*
                    상향식으로 더해준다
                    만약 dp[3][1,2,3,4]번쨰 동전을 사용했을때 만들수있는 값은 {1,2,5,10}일때 dp[4]의 동전의 구할때 동전의 가치가 v라면
                    - dp[4][1+v] = dp[4][1+v] + dp[3][1]
                    - dp[4][2+v] = dp[4][2+v] + dp[3][1] 방식으로 유도 가능
                     */
                    dp[i][nextValue] += dp[i-1][value];
                }
            }
        }

        System.out.println(dp[k][t]);
    }
}
