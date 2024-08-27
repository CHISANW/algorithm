package BaekJoonAlgorithm.그래프.DFS;

import java.util.*;

public class 안녕 {
    static int n;
    static int[] hp, happy;
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        hp = new int[n];
        happy = new int[n];

        for(int i =0; i<n;i++){
            hp [i] = sc.nextInt();
        }

        for (int i = 0;i<n;i++){
            happy[i] = sc.nextInt();
        }

        dfs(0,100,0);

        System.out.println(max);

    }

    static void dfs(int depth,int totalHp,int totalHappy){
        if (totalHp <= 0) {
            return;
        }

        if (depth == n) {
            max = Math.max(totalHappy, max);
            return;
        }

        dfs(depth + 1, totalHp - hp[depth], totalHappy + happy[depth]);
        dfs(depth + 1, totalHp, totalHappy);
    }
}
