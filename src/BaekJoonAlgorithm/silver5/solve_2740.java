package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];;

        for(int i =0; i<N;i++){
            for(int j =0; j<M;j++){
                A[i][j] = sc.nextInt();
            }
        }

        int M2 = sc.nextInt();
        int K = sc.nextInt();
        int[][] B = new int[M2][K];

        for (int i = 0; i < M2; i++) {
            for (int j = 0; j < K; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] c = new int[N][K];
        for(int i = 0; i<N; i++){
            for (int j = 0; j<K; j++){
                int sum = 0;
                for(int k = 0; k< M ; k++){
                    sum += A[i][k] * B[k][j];
                }
                c[i][j] = sum;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i< N;i++){
            for (int j = 0; j < K; j++) {
                sb.append(c[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
