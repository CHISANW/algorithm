package BaekJoonAlgorithm.재귀호출;

import java.io.IOException;
import java.util.Scanner;

public class 색종이만들기 {
    static int[][]paper;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        paper = new int[n][n];
        for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                paper[i][j] = sc.nextInt();
            }
        }

        partition(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }

    static void partition(int row, int col, int size){

        if (colorCheck(row,col,size)){
            if (paper[row][col]==0){
                white++;
            }else {
                blue++;
            }
            return;
        }
        int newSize = size/2;

        partition(row,col,newSize);     //2사 분면
        partition(row+newSize,col,newSize); //1사 분면
        partition(row,col+newSize,newSize); //3사 분면
        partition(row+newSize,col+newSize,newSize);
    }

     static boolean colorCheck(int row,int col, int size) {
        int color = paper[row][col];

        for (int i=row; i<row+size;i++){
            for (int j=col;j<col+size;j++){
                if (paper[i][j] !=color){
                    return false;
                }
            }
        }
         return true;
     }

}
