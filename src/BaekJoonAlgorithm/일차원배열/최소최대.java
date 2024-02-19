package BaekJoonAlgorithm.일차원배열;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

/**
 * 문제번호 10818번
 */
public class 최소최대 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min)
                min=arr[i];
        }

        sb.append(min).append(" ").append(max);
        System.out.println(sb);
        br.close();
    }
}
