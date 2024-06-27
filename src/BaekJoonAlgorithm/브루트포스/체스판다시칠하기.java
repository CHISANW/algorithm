package BaekJoonAlgorithm.브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class 체스판다시칠하기 {
    public static boolean[][] chess;
    public static int min = 64;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        chess = new boolean[N][M];
        for(int i =0;i<N;i++){
            String line = sc.next();
            for(int j= 0;j<M;j++){
                char c = line.charAt(j);
                if(c == 'W')
                    chess[i][j] = true;
                else
                    chess[i][j] = false;
            }
        }

        int start  = N-7;
        int end = M-7;

        for(int i =0;i<start;i++){
            for(int j =0;j<end;j++){
                find(i, j);
            }
        }

        System.out.println(min);

    }

    private static void find(int x, int y){
        int endX = x+8;
        int endY = y+8;
        int count = 0;

        boolean WB = chess[x][y];

        for(int i = x ; i<endX;i++){
            for(int j = y; j<endY;j++){

                if(chess[i][j] != WB){
                    count++;
                }
                WB = !WB;       // 색돌리기
            }
            WB = !WB;
        }

        count = Math.min(count , 64-count);

        min = Math.min(count, min);
    }
}