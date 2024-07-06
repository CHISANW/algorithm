package programmers.level_2;

public class 멀리뛰기 {
    public static void main(String[] args) {
        System.out.println(solution(4)); //result -> 4
        System.out.println(solution(3)); //result -> 3
    }

    public static long solution(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }

        return dp[n];
    }
}
