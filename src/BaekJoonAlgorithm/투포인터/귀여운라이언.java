package BaekJoonAlgorithm.투포인터;

import java.io.*;
import java.util.*;

public class 귀여운라이언 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());
        int k  = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i =0; i<n;i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        while (right < n){
            if (arr[right]== 1){
                count++;
            }
            right++;

            while (count >= k){
                minLength = Math.min(right-left,minLength);

                if (arr[left] == 1){
                    count--;
                }
                left++;
            }
        }

        if (minLength==Integer.MAX_VALUE){
            System.out.println(-1);
        }else
            System.out.println(minLength);
    }
}
