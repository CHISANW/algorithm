package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Scanner;

public class 정수제곱근 {
    static long calcSqrtInteger(long x) {
        if (x == 0) return 0;

        long l = 1, r = 1L << 32, sqrt = -1;
        while(l <= r) {
            long m = (r + l) / 2;
            if (m >= (x - 1) / m + 1) {
                r = m - 1;
                sqrt = m;
            }
            else l = m + 1;
        }
        return sqrt;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long n = stdIn.nextLong();

        long l = calcSqrtInteger(n);

        System.out.println(l);

    }
}
