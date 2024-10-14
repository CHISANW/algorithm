package BaekJoonAlgorithm.구현;

import java.io.*;
import java.util.*;

public class 배열돌리기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int rotations = (d / 45 + 8) % 8;

            for (int r = 0; r < rotations; r++) {
                arr = rotateClockwise45(arr);
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    private static int[][] rotateClockwise45(int[][] arr) {
        int n = arr.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[i][j] = arr[i][j];
            }
        }

        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            rotated[i][mid] = arr[i][i];
        }

        int index = n-1;
        for (int i = 0; i < n; i++) {
            rotated[n - 1 - i][i] = arr[index--][mid];
        }

        for (int i = 0; i < n; i++) {
            rotated[mid][i] = arr[n - 1 - i][i];
        }

        for (int i = 0; i < n; i++) {
            rotated[i][i] = arr[mid][i];
        }

        return rotated;
    }
}
