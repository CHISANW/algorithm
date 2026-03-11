package programmers.Re_Level_2;

public class 점프와순간이동 {
    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(5000));
    }

    static int solution(int n) {
        int[][] dp = new int[n+1][2];

        dp[1][0] = 1;
        dp[1][1] = 1;

        dp[2][0] = 1;
        dp[2][1] = 2;

        for(int i = 3; i<=n;i++){
            dp[i][1] = dp[i-1][1] + 1;
            if(i%2 == 0){
                dp[i][0] = dp[i/2][0];
            }else {
                dp[i][0] = dp[(i-1)/2][0] + 1;
            }
        }
        return Math.min(dp[n][0], dp[n][1]);
    }
}
