package BaekJoonAlgorithm.silver2;

import java.util.Scanner;

public class solve_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int L = sc.nextInt();

        for (int k = L; k <= 100; k++) {
            long constant = (long) k * (k - 1) / 2; // 0+1+...+(k-1)
            long temp = N - constant;

            if (temp < 0) break;              // 시작값이 음수가 될 수밖에 없음
            if (temp % k != 0) continue;      // 시작값이 정수가 아님

            long x = temp / k;                // 시작값
            if (x < 0) continue;              // 문제 조건: 음이 아닌 정수

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(x + i).append(' ');
            }
            System.out.println(sb.toString().trim());
            return;
        }

        System.out.println(-1);
    }
}
