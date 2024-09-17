package BaekJoonAlgorithm.브루트포스;

import java.util.*;

public class 떡먹는호랑이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[d+1];

        int a = 0;
        int b= 0;
        boolean find = false;
        for (int i =1 ; i<=k;i++){
            if (find) break;
            for (int j =1; j<=k;j++){
                dp[1] = i;
                dp[2] = j;
                for (int value = 3; value<=d;value++){
                    dp[value] = dp[value-1] + dp[value-2];
                }
                if (dp[d] == k){
                    a = i;
                    b = j;
                    find = true;
                    break;
                }
            }
        }

        System.out.println(a);
        System.out.println(b);
    }
}
