package programmers.level_2;

import java.util.Arrays;

public class 쿼드압축후개수세기 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        System.out.println(Arrays.toString(solution(arr)));     //result -> [4,9]

    }

    static int[][] board;
    static int zero;
    static int one;

    public static int[] solution(int[][] arr) {
        board = arr;
        zero = 0;
        one = 0;
        int length = arr.length;

        solve(0, 0, length);
        return new int[]{zero, one};
    }

    static void solve(int row, int col, int size) {
        if (check(row, col, size)) {
            if (board[row][col] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }

        int divLength = size / 2;

        solve(row, col, divLength);                  // 1사분면
        solve(row, col + divLength, divLength);      // 2사분면
        solve(row + divLength, col, divLength);      // 3사분면
        solve(row + divLength, col + divLength, divLength); // 4사분면
    }

    static boolean check(int row, int col, int size) {
        int type = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != type) {
                    return false;
                }
            }
        }
        return true;
    }
}
