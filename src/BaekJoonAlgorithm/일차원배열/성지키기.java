package BaekJoonAlgorithm.일차원배열;

import java.util.Scanner;

public class 성지키기 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        char[][] map = new char[n][m];
        for (int i=0;i<n;i++){
            map[i] = stdIn.next().toCharArray();
        }

        boolean[] existRow = new boolean[n];
        boolean[] existCol = new boolean[m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (map[i][j]=='X'){
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }

        int needRowCount = n;
        int needColCount = m;

        for (int i =0;i<n;i++){
            if (existRow[i]==true) needRowCount--;
        }
        for (int i =0;i<m;i++){
            if (existCol[i]==true) needColCount--;
        }

        System.out.println(Math.max(needRowCount,needColCount));

    }
}
