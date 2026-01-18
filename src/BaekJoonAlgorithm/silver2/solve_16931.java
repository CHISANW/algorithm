package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_16931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int surfaceArea = 0;

        // 위/아래 면
        surfaceArea += 2 * (N * M);

        // 동서 방향
        for (int i = 0; i < N; i++) {
            // 왼쪽 가장자리
            surfaceArea += map[i][0];
            // 내부 차이
            for (int j = 1; j < M; j++) {
                if (map[i][j] > map[i][j - 1]) {
                    surfaceArea += map[i][j] - map[i][j - 1];
                }
            }
            // 오른쪽 가장자리
            surfaceArea += map[i][M - 1];
            for (int j = M - 2; j >= 0; j--) {
                if (map[i][j] > map[i][j + 1]) {
                    surfaceArea += map[i][j] - map[i][j + 1];
                }
            }
        }

        // 남북 방향
        for (int j = 0; j < M; j++) {
            // 위쪽 가장자리
            surfaceArea += map[0][j];
            // 내부 차이
            for (int i = 1; i < N; i++) {
                if (map[i][j] > map[i - 1][j]) {
                    surfaceArea += map[i][j] - map[i - 1][j];
                }
            }
            // 아래쪽 가장자리
            surfaceArea += map[N - 1][j];
            for (int i = N - 2; i >= 0; i--) {
                if (map[i][j] > map[i + 1][j]) {
                    surfaceArea += map[i][j] - map[i + 1][j];
                }
            }
        }

        System.out.println(surfaceArea);
    }
}
