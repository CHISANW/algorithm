package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_19939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // K개의 서로 다른 자연수의 최소 합
        int minSum = k * (k + 1) / 2;

        // 불가능한 경우
        if (n < minSum) {
            System.out.println(-1);
            return;
        }

        // 남은 공
        int rest = n - minSum;

        // 나머지로 정답 결정
        if (rest % k == 0) {
            System.out.println(k - 1);
        } else {
            System.out.println(k);
        }
    }
}

