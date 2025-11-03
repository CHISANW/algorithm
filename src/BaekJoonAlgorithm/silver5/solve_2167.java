package BaekJoonAlgorithm.silver5;

import java.util.Arrays;
import java.util.Scanner;

public class solve_2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][m+1];

        for(int i =1; i<=n;i++){
            for(int j =1; j<=m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =1;i<=n;i++){
            for(int j =1; j<=m;j++){
                arr[i][j] = arr[i][j] + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
            }
        }
        int k = sc.nextInt();

        for(int i =0; i<k;i++){
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            System.out.println(arr[r2][c2] - arr[r1-1][c2] - arr[r2][c1-1] + arr[r1-1][c1-1]);
        }
    }
}
