package BaekJoonAlgorithm.브루트포스;

import java.util.Scanner;

public class 사탕게임 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        char[][] map = new char[n][n];

        for (int i =0;i<n;i++){
            map[i]=stdIn.next().toCharArray();
        }

        int ans = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j+1<n && map[i][j]!=map[i][j+1]){
                    swapCandy(map,i,j,i,j+1);
                    ans=Math.max(ans,Math.max(maxColumn(map),maxRow(map)));
                    swapCandy(map,i,j,i,j+1);
                }
                if (i+1<n&&map[i][j]!=map[i+1][j]){
                    swapCandy(map,i,j,i+1,j);
                    ans=Math.max(ans,Math.max(maxColumn(map),maxRow(map)));
                    swapCandy(map,i,j,i+1,j);
                }
            }
        }
        System.out.println(ans);

    }

    private static int maxColumn(char[][] map) {
        int length = map.length;
        int max = 0;
        for (int j =0;j<length;j++){
            int len=1;
            for (int i=1;i<length;i++){
                if (map[i][j]==map[i-1][j])len++;
                else {
                    max = Math.max(max, len);
                    len=1;
                }
            }
            max = Math.max(max, len);
        }
        return max;
    }

    private static int maxRow(char[][] map) {
        int length = map.length;
        int max = 0;
        for (int i =0;i<length;i++){
            int len=1;
            for (int j=1;j<length;j++){
                if (map[i][j]==map[i][j-1])len++;
                else {
                    max = Math.max(max, len);
                    len=1;
                }
            }
            max = Math.max(max, len);
        }
        return max;
    }

    private static void swapCandy(char[][] map, int r1, int c1, int r2, int c2) {
        char temp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2]= temp;
    }
}
