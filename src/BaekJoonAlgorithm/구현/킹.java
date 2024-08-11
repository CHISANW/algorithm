package BaekJoonAlgorithm.구현;

import java.util.*;

public class 킹 {
    static int[][] ches = new int[9][9];
    static int kingRow, kingCol, stoneRow, stoneCol;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String king = sc.next();
        String stone = sc.next();
        int n = sc.nextInt();

        kingRow = king.charAt(0) - 'A' + 1;
        kingCol = king.charAt(1) - '0';
        stoneRow = stone.charAt(0) - 'A' + 1;
        stoneCol = stone.charAt(1) - '0';

        ches[kingRow][kingCol] = 1;     // 킹
        ches[stoneRow][stoneCol] = 2;   // 돌

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            move(type);
        }

        System.out.println(converter(kingRow, kingCol));
        System.out.println(converter(stoneRow, stoneCol));

    }

    static void move(String type) {
        int[] d = direction(type);

        int newKingRow = kingRow + d[1];
        int newKingCol = kingCol + d[0];

        if (isRange(newKingRow, newKingCol)) {
            if (checkStone(newKingRow, newKingCol)) {
                int newStoneRow = stoneRow + d[1];
                int newStoneCol = stoneCol + d[0];
                if (isRange(newStoneRow, newStoneCol)) {
                    ches[stoneRow][stoneCol] = 0;
                    ches[newStoneRow][newStoneCol] = 2;
                    stoneRow = newStoneRow;
                    stoneCol = newStoneCol;
                } else {
                    return;
                }
            }
            ches[kingRow][kingCol] = 0;
            ches[newKingRow][newKingCol] = 1;
            kingRow = newKingRow;
            kingCol = newKingCol;
        }
    }

    static int[] direction(String type) {
        return switch (type) {
            case "R" -> new int[]{0, 1};
            case "L" -> new int[]{0, -1};
            case "B" -> new int[]{-1, 0};
            case "T" -> new int[]{1, 0};
            case "RT" -> new int[]{1, 1};
            case "LT" -> new int[]{1, -1};
            case "RB" -> new int[]{-1, 1};
            case "LB" -> new int[]{-1, -1};
            default -> new int[]{0, 0};
        };
    }

    static boolean isRange(int row, int col) {
        return row > 0 && row <= 8 && col > 0 && col <= 8;
    }

    static boolean checkStone(int row, int col) {
        return ches[row][col] == 2;
    }

    static String converter(int row, int col) {
        return switch (row) {
            case 1 -> "A" + col;
            case 2 -> "B" + col;
            case 3 -> "C" + col;
            case 4 -> "D" + col;
            case 5 -> "E" + col;
            case 6 -> "F" + col;
            case 7 -> "G" + col;
            default -> "H" + col;
        };
    }
}
