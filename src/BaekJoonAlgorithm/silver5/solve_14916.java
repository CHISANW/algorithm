package BaekJoonAlgorithm.silver5;

import java.util.Arrays;
import java.util.Scanner;

public class solve_14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        int InF = 100001;
        Arrays.fill(dp, InF);
        dp[0] = 0;

        for(int i =1 ; i<=n;i++){
            if( i>=2 && dp[i-2] != InF)
                dp[i] = Math.min(dp[i], dp[i-2] +1);
            if( i>=5 && dp[i-5] != InF)
                dp[i] = Math.min(dp[i], dp[i-5] +1);
        }

        if(dp[n] == InF){
            System.out.println(-1);
        }else{
            System.out.println(dp[n]);
        }
    }
}
