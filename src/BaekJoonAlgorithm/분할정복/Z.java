package BaekJoonAlgorithm.분할정복;

import java.util.*;

public class Z {
    static int a,b,c;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        solve(a,b,c);
        System.out.println(count);
    }

    static void solve(int n, int row, int col){
        int boardSize = 1 << n;  //2^n
        int mid = boardSize/2;

        if(n == 0) return;

        //좌상단
        if(row<mid && col<mid){
            solve(n-1,row,col);
        }
        //우상단
        if(row<mid && col>=mid){
            count += mid*mid;       // 현재 재귀의 가로 * 세로(1개)
            solve(n-1,row,col-mid);
        }
        //좌하단
        if(row>=mid && col< mid){
            count += (mid*mid)*2;  // 현재 재귀에서 가로 * 세로 (2개)
            solve(n-1,row-mid, col);
        }
        //우하단
        if(row>=mid && col>=mid){
            count += (mid*mid)*3;  // 현재 재귀에서 가로 * 세로 (3개)
            solve(n-1,row-mid,col-mid);
        }
    }
}
