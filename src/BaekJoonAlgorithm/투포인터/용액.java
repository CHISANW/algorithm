package BaekJoonAlgorithm.투포인터;

import java.io.*;
import java.util.*;

public class 용액 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        long [] arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        long min = Long.MAX_VALUE;
        long[] ans = new long[2];
        int left = 0;
        int right = n - 1;

        while (left < right) {
            long sum = arr[left] + arr[right];

            if (Math.abs(sum) <= min) {
                min = Math.abs(sum);
                ans[0] = arr[left];
                ans[1] = arr[right];
            }
            if (sum >= 0) {
                right--;
            }
            else {
                left++;
            }
        }

        Arrays.sort(ans);
        for (long an : ans) {
            System.out.println(an);
        }
    }
}