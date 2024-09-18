package BaekJoonAlgorithm.구현;

import java.util.Arrays;
import java.util.Scanner;

public class 봄버맨 {
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static int R, C, N;
    static char[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        N = sc.nextInt();
        sc.nextLine();

        grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }

        if (N == 1) {
            // N이 1인 경우 초기 상태 그대로 출력
            printGrid();
        } else if (N % 2 == 0) {
            // N이 짝수인 경우 모든 칸에 폭탄이 가득한 상태 출력
            fillWithBombs();
        } else {
            // N이 3이나 5인 경우 시뮬레이션 진행
            char[][] afterFirstExplosion = simulateExplosion(grid);
            if (N % 4 == 3) {
                // N % 4 == 3 -> 첫 번째 폭발 후 상태
                printGrid(afterFirstExplosion);
            } else {
                // N % 4 == 1 -> 두 번째 폭발 후 상태
                char[][] afterSecondExplosion = simulateExplosion(afterFirstExplosion);
                printGrid(afterSecondExplosion);
            }
        }
    }

    // 폭탄 설치 후 3초 후의 상태를 시뮬레이션
    private static char[][] simulateExplosion(char[][] grid) {
        char[][] newGrid = new char[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(newGrid[i], 'O'); // 모든 칸에 폭탄 채우기
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 'O') {
                    newGrid[i][j] = '.';
                    for (int k = 0; k < 4; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (ni >= 0 && ni < R && nj >= 0 && nj < C) {
                            newGrid[ni][nj] = '.';
                        }
                    }
                }
            }
        }
        return newGrid;
    }

    // 격자판을 출력하는 함수
    private static void printGrid() {
        for (int i = 0; i < R; i++) {
            System.out.println(new String(grid[i]));
        }
    }

    // 특정 격자판 상태를 출력하는 함수
    private static void printGrid(char[][] grid) {
        for (int i = 0; i < R; i++) {
            System.out.println(new String(grid[i]));
        }
    }

    // 격자판을 모두 폭탄으로 채우는 함수
    private static void fillWithBombs() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print('O');
            }
            System.out.println();
        }
    }
}