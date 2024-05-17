package BaekJoonAlgorithm.분할정복;

import java.util.Scanner;

public class 별찍기 {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        arr = new char[n][n];

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = ' ';
            }
        }
        star(0, 0, n);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void star(int x, int y, int n) {
        if(n==1) {
            arr[x][y]='*';
            return;
        }

        int next = n/3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) {
                    star( x + i * next, y + j * next, next);
                }
            }
        }

    }
}