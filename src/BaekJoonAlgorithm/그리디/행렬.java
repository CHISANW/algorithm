package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class 행렬 {
    static int[][] arrA;
    static int[][] arrB;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arrA = new int[n][m];
        arrB = new int[n][m];

        for (int i = 0;i<n;i++){
            String row = sc.next();
            for (int j =0;j<m;j++){
                arrA[i][j] = row.charAt(j)-'0';
            }
        }

        for (int i = 0;i<n;i++){
            String row = sc.next();
            for (int j =0;j<m;j++){
                arrB[i][j] = row.charAt(j)-'0';
            }
        }

        if (n<3 || m < 3){
            if (checkArray(n,m))
                System.out.println(0);
            else
                System.out.println(-1);
            return;
        }

        int answer = 0;

        for (int i =0;i<n-2;i++){
            for (int j =0; j<m-2;j++){
                if (arrA[i][j] != arrB[i][j]){
                    changeSquareBoard(i,j);
                    answer++;
                }
            }
        }
        if (!checkArray(n,m)) answer=-1;

        System.out.println(answer);
    }


    static boolean checkArray(int n, int m){
        for (int i =0; i<n;i++){
            for (int j =0;j<m;j++){
                if (arrA[i][j] != arrB[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

     static void changeSquareBoard(int startY, int startX) {
        for (int i = startY; i < startY + 3; i++) {
            for (int j = startX; j < startX + 3; j++) {
                if (arrA[i][j] == 1) {
                    arrA[i][j] = 0;
                } else {
                    arrA[i][j] = 1;
                }
            }
        }
    }
}
