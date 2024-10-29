package BaekJoonAlgorithm.그리디;

import java.io.*;
import java.util.*;

public class 오차전직 {
    static int n,k;
    static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

       Arrays.sort(arr);

        long answer = 0;
        int count = 1;
        for(int i = 1; i < n; i++) {
          if (count<k){
              answer += arr[i] * count;
              count++;
          }else{
              answer += arr[i] * count;
          }
        }

        System.out.println(answer);
    }
}
