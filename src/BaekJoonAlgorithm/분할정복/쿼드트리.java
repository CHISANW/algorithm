package BaekJoonAlgorithm.분할정복;

import java.util.Scanner;

public class 쿼드트리 {
    static int[][]board;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        board = new int[n][n];

        for(int i =0;i<n;i++){
            String s = sc.next();
            for(int j =0;j<n;j++){
                board[i][j] = s.charAt(j)-'0';
            }
        }

        compress(0,0,n);

    }

    static void compress(int row, int col, int length){
        if(isSame(row,col,length)){
            System.out.print(board[row][col]);
            return;
        }

        int mid = length/2;
        System.out.print("(");
        compress(row,col,length/2);     //좌상
        compress(row,col+mid,length/2);     //우상
        compress(row+mid,col,length/2);     //좌하
        compress(row+mid,col+mid,length/2);     //우하
        System.out.print(")");

    }

    private static boolean isSame(int r, int c, int length){
        for(int i =0;i<length;i++){
            for(int j =0;j<length;j++){
                if(board[r][c]!=board[r+i][c+j]) return false;
            }
        }
        return true;
    }
}
