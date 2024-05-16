package BaekJoonAlgorithm.분할정복;

import java.util.Scanner;

public class 종이의개수 {
    static int[][] board;
    static int[] check = new int[3];    //[0]=-1 , [1]=0 , [2]=1
    static int n;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j] = sc.nextInt();
            }
        }

        solve(0,0,n);

        for(int ans : check){
            System.out.println(ans);
        }
    }

    static void solve(int row,int col,int length){
        if(isSame(row,col,length)){
            int color = board[row][col] +1;
            check[color]++;
            return;
        }

        int next = length/3;
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                solve(row+(next*i),col+next*j,next);
            }
        }
    }

    static boolean isSame(int row, int col,int length){
        for(int i =0;i<length;i++){
            for(int j =0;j<length;j++){
                if(board[row][col] != board[row+i][col+j]) return false;
            }
        }
        return true;
    }
}
