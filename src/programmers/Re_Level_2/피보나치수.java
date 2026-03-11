package programmers.Re_Level_2;

public class 피보나치수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(5));
    }

    static int solution(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;

        for(int i =3;i<=n;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        return dp[n];
    }
}
