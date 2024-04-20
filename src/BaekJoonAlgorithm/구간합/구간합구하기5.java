package BaekJoonAlgorithm.구간합;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 구간합구하기5 {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        int[][] arr = new int[n+1][n+1];

        for (int i =1;i<=n;i++){
            for (int j=1;j<=n;j++){
                arr[i][j] = stdIn.nextInt();
            }
        }

        int[][]acc = new int[n+1][n+1];
        //구간합 구하기
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                acc[i][j] = acc[i][j-1]+acc[i-1][j]-acc[i-1][j-1]+arr[i][j];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (m-- > 0){
            int x1 = stdIn.nextInt();
            int y1 = stdIn.nextInt();
            int x2 = stdIn.nextInt();
            int y2 = stdIn.nextInt();

            bw.write(acc[x2][y2]-acc[x1-1][y2]-acc[x2][y1-1]+acc[x1-1][y1-1]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
