package BaekJoonAlgorithm.silver4;

import java.util.Arrays;
import java.util.Scanner;

public class solve_10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        char[] digits = N.toCharArray();

        if (!N.contains("0")) {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        for (char c : digits) {
            sum += (c - '0');
        }

        if (sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(digits);

        StringBuilder sb = new StringBuilder(new String(digits));
        System.out.println(sb.reverse().toString());
    }

}
