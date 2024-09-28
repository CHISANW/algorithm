package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class BOJ거리 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String line = sc.next();

        int[] dp = new int[n+1];

        for (int i =2; i<=n ;i++){
            dp[i] =Integer.MAX_VALUE;
        }

        dp[1] = 0;

        for (int i =1; i<=n;i++){
            char now = line.charAt(i-1);
            if (dp[i]== Integer.MAX_VALUE) continue;
            for (int j = i+1; j<=n;j++){
                char next = line.charAt(j-1);
                if (checkBlock(now, next)){
                    int jump =j - i;
                    dp[j] = Math.min(dp[j], dp[i]+jump*jump);
                }
            }
        }


        System.out.println(dp[n] == Integer.MAX_VALUE?-1 : dp[n]);
    }
    static boolean checkBlock(char now , char next){
        boolean check = false;
        if (now=='B' && next=='O') check = true;
        else if (now == 'O' && next=='J') check = true;
        else if (now == 'J' && next =='B') check =true;

        return check;
    }
}
