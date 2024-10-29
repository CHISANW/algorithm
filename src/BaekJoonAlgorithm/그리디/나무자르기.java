package BaekJoonAlgorithm.그리디;

import java.io.*;
import java.util.*;

public class 나무자르기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        long answer = 0;
        st= new StringTokenizer(br.readLine());
        for (int i =0; i<n;i++){
            answer += Integer.parseInt(st.nextToken());
        }

        int[] arr =new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n;i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i =0; i<n;i++){
            answer += (long) arr[i] * i;
        }
        System.out.println(answer);
    }
}
