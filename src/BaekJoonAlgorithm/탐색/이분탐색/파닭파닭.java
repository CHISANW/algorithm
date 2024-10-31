package BaekJoonAlgorithm.탐색.이분탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 파닭파닭 {
    static long[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        arr = new long[s];
        long max = 0;
        for (int i = 0; i < s; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i], max);
        }

        long l = 1;
        long r = max;

        long answer = 0;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (cut(mid) >= c) {
                answer = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }

        long totalLength = 0;
        for (long length : arr) {
            totalLength += length;
        }
        System.out.println(totalLength - (long) answer * c);
    }

    static int cut(long value){
        int cutCount = 0;
        for (long i : arr) {
            cutCount += i/value;
        }
        return cutCount;
    }
}
