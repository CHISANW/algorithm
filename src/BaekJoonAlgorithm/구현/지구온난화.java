package BaekJoonAlgorithm.구현;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 지구온난화 {
    static int[] dx = {-1,1,0,0}; // 상 하 좌 우
    static int[] dy ={0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] board = new char[r+2][c+2];

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < r + 2; i++) {
            Arrays.fill(board[i], '.');
        }

        for (int i =1; i<=r;i++){
            String line = sc.next();
            for (int j =1;j<=c;j++){
                if (line.charAt(j-1)=='X'){
                    board[i][j] = 'X';
                }
            }
        }

        List<String> change = new ArrayList<>();
       for (int i =0;i<rows;i++){
           for (int j = 0;j<cols;j++){
               int count = 0;
               if (board[i][j] == 'X'){
                   for (int k =0;k<4;k++){
                       int nr = i+dx[k];
                       int nc = j+dy[k];
                       if (board[nr][nc]=='.') count++;
                   }
              }
               if (count>=3){
                   change.add(String.valueOf(i+" "+j));
               }
           }
       }

        for (String s : change) {
            String[] split = s.split(" ");
            board[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = '.';
        }



        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'X') {
                    minX = Math.min(minX, i);  // 세로의 최소값
                    minY = Math.min(minY, j);  // 가로의 최소값
                    maxX = Math.max(maxX, i);  // 세로의 최대값
                    maxY = Math.max(maxY, j);  // 가로의 최대값
                }
            }
        }

        for (int i = minX; i <= maxX; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = minY; j <= maxY; j++) {
                row.append(board[i][j]);
            }
            System.out.println(row);
        }
    }
}
