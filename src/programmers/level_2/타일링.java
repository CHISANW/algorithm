package programmers.level_2;

public class 타일링 {
    public static void main(String[] args) {
        System.out.println(solution(4));// result -> 4
    }

    public static int solution(int n) {
        int[] dp = new int[n+2];

        dp[1] = 1;
        dp[2] = 2;
        for(int i =3;i<=n;i++){
            dp[i] = (dp[i-1]+dp[i-2])% 1_000_000_007;
        }
        return dp[n];
    }
}
