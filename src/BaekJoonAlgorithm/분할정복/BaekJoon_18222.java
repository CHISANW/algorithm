package BaekJoonAlgorithm.분할정복;

import java.util.Scanner;

public class BaekJoon_18222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        System.out.println(rec(k - 1));
    }

    private static int rec(long k) {
        if (k == 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        if (k % 2 == 0) {
            return rec(k / 2);
        }
        return 1 - rec(k / 2);
    }
}
