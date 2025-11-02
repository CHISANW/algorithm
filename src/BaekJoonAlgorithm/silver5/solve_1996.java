package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1996 {
    static int[] nr = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] nc = {0, 1, 1, 1, 0, -1, -1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            char[] chars = line.toCharArray();
            for (int j = 0; j < n; j++) {
                if (chars[j] != '.') {
                    map[i][j] = chars[j] - '0';
                } else {
                    map[i][j] = 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0) {
                    sb.append('*');
                } else {
                    int sum = 0;
                    for (int k = 0; k < 8; k++) {
                        int x = i + nr[k];
                        int y = j + nc[k];
                        if (x >= 0 && x < n && y >= 0 && y < n) {
                            sum += map[x][y];
                        }
                    }
                    if (sum >= 10) sb.append('M');
                    else sb.append(sum);
                }
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
