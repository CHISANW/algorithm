package BaekJoonAlgorithm.silver5;

import java.util.Arrays;
import java.util.Scanner;

public class solve_1652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];

        for(int i =0; i<n;i++){
            String line = sc.next();
            for(int j =0; j<n;j++){
                board[i][j] = line.charAt(j);
            }
        }

        int row = 0;
        int col = 0;

        for(int i =0; i<n;i++){
            int count =0;
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '.'){
                    count++;
                }else if(board[i][j] =='X'){
                    if(count >=2){
                        row++;
                    }
                    count=0;
                }
                if(j  == n-1){
                    if(count >=2){
                        row++;
                    }
                }
            }
        }

        for(int i =0;i<n;i++){
            int count =0;
            for(int j =0; j<n;j++){
                if(board[j][i] == '.'){
                    count++;
                }else if(board[j][i] =='X'){
                    if(count >=2){
                        col++;
                    }
                    count=0;
                }
                if(j == n-1){
                    if(count >=2){
                        col++;
                    }
                }
            }
        }

        System.out.println(row + " " + col);
    }
}
