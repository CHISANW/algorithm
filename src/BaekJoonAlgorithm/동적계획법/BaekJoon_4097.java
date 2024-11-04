package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class BaekJoon_4097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true){
            int t = sc.nextInt();
            if (t == 0) break;
            int[] arr = new int[t];
            int[] dp = new int[t];
            for (int i = 0; i<t;i++){
                arr[i] = sc.nextInt();
            }

            dp[0] = arr[0];
            int maxProfit = dp[0];

            for (int i =1;i<t;i++){
                dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
                maxProfit = Math.max(maxProfit, dp[i]);
            }

            System.out.println(maxProfit);
        }
    }
}
