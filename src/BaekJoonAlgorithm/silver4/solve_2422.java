package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_2422 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] bad = new boolean[n+1][n+1];

        for(int i =0; i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            bad[a][b] = true;
            bad[b][a] = true;
        }

        int count = 0;

        for(int i =1; i<=n; i++){
            for(int j= i+1 ;j<=n; j++){
                if(bad[i][j]) continue;
                for(int k = j+1; k<=n; k++){
                    if(bad[i][k] || bad[j][k]) continue;
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
