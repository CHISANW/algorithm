package BaekJoonAlgorithm.silver2;

import java.io.*;
import java.util.*;


public class solve_9020 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        int[] nums = new int[T];
        int max = 0;
        for (int i = 0; i < T; i++) {
            nums[i] = Integer.parseInt(br.readLine().trim());
            if (nums[i] > max) max = nums[i];
        }

        boolean[] isPrime = sieve(max);

        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            int a = n / 2;
            while (a >= 2) {
                int b = n - a;
                if (isPrime[a] && isPrime[b]) {
                    sb.append(a).append(' ').append(b).append('\n');
                    break;
                }
                a--;
            }
        }

        System.out.print(sb.toString());
    }

    // 에라토스테네스의 체: 0..max까지 소수 여부
    private static boolean[] sieve(int max) {
        boolean[] isPrime = new boolean[max + 1];
        if (max >= 2) Arrays.fill(isPrime, true);
        if (max >= 0) isPrime[0] = false;
        if (max >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <= max; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
