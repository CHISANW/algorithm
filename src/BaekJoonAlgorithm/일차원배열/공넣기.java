package BaekJoonAlgorithm.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제 번호 10810번
 */
public class 공넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int d=0;d<m;d++){
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());
            for (int c=i; c<=j;c++){
                arr[c-1]=k;
            }
        }

        for (int z=0;z<arr.length;z++)
            sb.append(arr[z]).append(" ");

        System.out.println(sb);
        br.close();
    }
}
