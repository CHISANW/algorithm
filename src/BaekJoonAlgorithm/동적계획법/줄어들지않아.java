package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 줄어들지않아 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] caseArr = new int[t];
        for (int i = 0; i<t;i++){
            caseArr[i] = sc.nextInt();
        }

        long[][] dp = new long[65][10];

        for (int i =0; i<10;i++){
            dp[1][i] = 1;
        }

        for (int i =2; i<=64;i++){
            for (int j =0; j<=9;j++){
                dp[i][j] = dp[i-1][j];

                if (j > 0){
                    dp[i][j] += dp[i][j-1];
                }
            }
        }

        for (int i =0;i<t;i++){
            long result = 0;
            for (int j= 0;j<=9;j++){
                result += dp[caseArr[i]][j];
            }
            System.out.println(result);
        }
    }
}
