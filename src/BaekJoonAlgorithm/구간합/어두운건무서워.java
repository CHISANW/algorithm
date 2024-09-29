package BaekJoonAlgorithm.구간합;

import java.util.Scanner;

public class 어두운건무서워 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int q = sc.nextInt();

        int[][] arr = new int[r + 1][c + 1];
        int[][] sum = new int[r + 1][c + 1];

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                arr[i][j] = sc.nextInt();
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + arr[i][j];
            }
        }

        for (int i =0; i<q;i++){
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int totalBrightness = sum[r2][c2] - sum[r1 - 1][c2] - sum[r2][c1 - 1] + sum[r1 - 1][c1 - 1];

            int area = (r2 - r1 + 1) * (c2 - c1 + 1);

            System.out.println(totalBrightness/area);
        }
    }
}
