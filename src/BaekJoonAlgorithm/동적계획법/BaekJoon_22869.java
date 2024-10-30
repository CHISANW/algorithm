package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class BaekJoon_22869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();

        int[] arr = new int[n+1];
        for (int i = 1; i<=n;i++){
            arr[i] = sc.nextInt();
        }

        boolean[] dp = new boolean[n+1];
        dp[1] = true;


        for (int i = 1;i<n;i++){
            if (dp[i]){
                for (int j = i+1; j<=n;j++){
                    int value = (j - i) * (1 + Math.abs(arr[i] - arr[j]));
                    if (value <= k) {
                        dp[j] = true;
                    }
                }
            }
        }

        if (dp[n]){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
