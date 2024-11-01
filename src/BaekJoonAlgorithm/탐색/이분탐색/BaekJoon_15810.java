package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Scanner;

public class BaekJoon_15810 {
    static long[] arr;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        arr = new long[n];

        long maxTime = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            maxTime = Math.max(maxTime, arr[i]);
        }


        long left = 0;
        long right = maxTime * m;
        long answer = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (check(mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }

    static boolean check(long mid) {
        long sum = 0;
        for (long time : arr) {
            sum += mid / time;
            if (sum >= m) return true;
        }
        return sum >= m;
    }
}