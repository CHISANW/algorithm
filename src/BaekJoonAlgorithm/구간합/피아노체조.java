package BaekJoonAlgorithm.구간합;

import java.io.*;
import java.util.*;

public class 피아노체조 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i =1; i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[n+1];

        for (int i =1;i<n;i++){
            if (arr[i] > arr[i+1]){
                sum[i] = sum[i-1] + 1;
            }else{
                sum[i] = sum[i-1];
            }
        }
        sum[n] = sum[n-1];

        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i<q;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(sum[end-1] - sum[start-1]).append("\n");
        }
        System.out.println(sb);
    }
}
