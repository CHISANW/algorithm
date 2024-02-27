package BaekJoonAlgorithm.two차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 2738번
 */
public class 행렬덧셈 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][]  a = new int[n][m];

        for (int i =0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            for (int j =0;j<m;j++){
                a[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        for (int i =0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            for (int j =0;j<m;j++){
                a[i][j] += Integer.parseInt(st1.nextToken());
            }
        }

        for (int i=0;i<n;i++){
            for (int j = 0;j<m;j++)
                System.out.print(a[i][j]+ " ");
            System.out.println();
        }
        br.close();
    }
}
