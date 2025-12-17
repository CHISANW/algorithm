package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_2578 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[5][5];
        int[][] callOrder = new int[5][5];

        // 빙고판 입력
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                board[i][j] = sc.nextInt();
            }
        }

        // 부르는 순서대로 번호 입력
        int[] calls = new int[25];
        for(int i = 0; i < 25; i++){
            calls[i] = sc.nextInt();
        }

        // 순서대로 처리
        int count = 0;
        for(int k = 0; k < 25; k++){
            count++;
            int num = calls[k];

            // 부른 숫자를 배열에 표시
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(board[i][j] == num) {
                        callOrder[i][j] = 1;
                    }
                }
            }

            // 빙고 줄 수 체크
            int bingoCount = 0;

            // 가로 세로 체크
            for(int i = 0; i < 5; i++){
                int rowSum = 0;
                int colSum = 0;
                for(int j = 0; j < 5; j++){
                    rowSum += callOrder[i][j];
                    colSum += callOrder[j][i];
                }
                if(rowSum == 5) bingoCount++;
                if(colSum == 5) bingoCount++;
            }

            // 대각선 체크
            int diag1 = callOrder[0][0] + callOrder[1][1] + callOrder[2][2] + callOrder[3][3] + callOrder[4][4];
            int diag2 = callOrder[0][4] + callOrder[1][3] + callOrder[2][2] + callOrder[3][1] + callOrder[4][0];
            if(diag1 == 5) bingoCount++;
            if(diag2 == 5) bingoCount++;

            // 3줄 이상이면 정답 출력 후 종료
            if(bingoCount >= 3) {
                System.out.println(count);
                return;
            }
        }
    }
}
