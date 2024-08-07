package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c1 = (' '+sc.next()).toCharArray();
        char[] c2 = (' '+sc.next()).toCharArray();


        int[][] dp =new int[c1.length][c2.length];

        for(int i =1; i<c1.length;i++){
            for(int j =1; j<c2.length;j++){
                if(c1[i]==c2[j]){
                    dp[i][j] = dp[i-1][j-1] +1;
                }else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }

        System.out.println(dp[c1.length-1][c2.length-1]);

    }
}
