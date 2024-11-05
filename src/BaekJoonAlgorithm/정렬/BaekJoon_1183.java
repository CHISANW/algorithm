package BaekJoonAlgorithm.정렬;

import java.io.*;
import java.util.*;

public class BaekJoon_1183 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i] = start - end;
        }

        Arrays.sort(arr);

        if (n % 2 == 1) System.out.println(1);
        else System.out.println(Math.abs(arr[n / 2] - arr[n / 2 - 1]) + 1);
    }
}
