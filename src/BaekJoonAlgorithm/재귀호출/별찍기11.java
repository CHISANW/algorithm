package BaekJoonAlgorithm.재귀호출;

import java.util.Scanner;

public class 별찍기11 {
    static char[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        map = new char[n][2 * n -1];
        for(int i =0; i<n;i++){
            for(int j = 0; j<2 * n - 1; j++){
                map[i][j] = ' ';
            }
        }

        drawStart(n,0,n-1);

        StringBuilder sb = new StringBuilder();

        for(int i =0; i<n;i++){
            for (int j = 0; j<2*n -1;j++){
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void drawStart(int n, int x, int y){
        if(n == 3){
            map[x][y] = '*';
            map[x + 1][y - 1] = '*';
            map[x + 1][y + 1] = '*';
            map[x + 2][y - 2] = '*';
            map[x + 2][y - 1] = '*';
            map[x + 2][y] = '*';
            map[x + 2][y + 1] = '*';
            map[x + 2][y + 2] = '*';
            return;
        }

        int m = n /2;
        drawStart(m, x, y);
        drawStart(m,x+m, y-m);
        drawStart(m,x+m, y+m);
    }
}
