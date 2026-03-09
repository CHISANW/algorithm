package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_2567 {
    static int[][] map = new int[102][102];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            for (int r = x; r < x + 10; r++) {
                for (int c = y; c < y + 10; c++) {
                    map[r][c] = 1;
                }
            }
        }

        int perimeter = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {

                if (map[i][j] == 1) {

                    for (int d = 0; d < 4; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        if (map[nx][ny] == 0) {
                            perimeter++;
                        }
                    }

                }
            }
        }

        System.out.println(perimeter);
    }
}
