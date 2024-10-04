package BaekJoonAlgorithm.그리디;

import java.io.*;
import java.util.*;

public class 삼각형만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int ans = -1;

        for (int i = 0; i < n - 2; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int c = arr[i + 2];

            if (a < b+ c){
                ans = a+b+c;
                break;
            }
        }
        System.out.println(ans);
    }
}
