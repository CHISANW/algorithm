package BaekJoonAlgorithm.two차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 2566번
 */
public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] a= new int[9][9];
        int max= 0;
        int c=0;
        int d=0;


        for (int i=0;i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<9;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0;i<9;i++) {
            for (int j = 0; j < 9; j++){
                if(max<=a[i][j]) {
                    max = a[i][j];
                    c=i;
                    d=j;
                }
            }
        }
        sb.append(max).append("\n").append((c+1)+" "+(d+1));

        System.out.println(sb);
        br.close();
    }
}
