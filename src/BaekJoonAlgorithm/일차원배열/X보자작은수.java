package BaekJoonAlgorithm.일차원배열;

import java.io.*;
import java.util.*;

/**
 * 문제번호 10871번
 */
public class X보자작은수 {
    public static void main(String args[]) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st2 = new StringTokenizer(bw.readLine(), " ");
        int n = Integer.parseInt(st2.nextToken());
        int a = Integer.parseInt(st2.nextToken());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(bw.readLine()," ");

        for (int i =0;i<n;i++){
           arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i =0;i<arr.length;i++){
            if (a>arr[i])
                sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
        bw.close();;
    }
}
