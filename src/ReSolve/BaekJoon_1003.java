package ReSolve;

import java.util.Scanner;

public class BaekJoon_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] dp0 = new int[41];
        int[] dp1 = new int[41];

        dp0[0] = 1; dp1[0] = 0;
        dp0[1] = 0; dp1[1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp0[i] = dp0[i - 1] + dp0[i - 2];
            dp1[i] = dp1[i - 1] + dp1[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            sb.append(dp0[n]).append(" ").append(dp1[n]).append("\n");
        }

        System.out.print(sb);
    }
}