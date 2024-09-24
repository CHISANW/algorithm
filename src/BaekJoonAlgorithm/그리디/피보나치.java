package BaekJoonAlgorithm.그리디;

import java.util.*;

public class 피보나치 {
    static int[] dp = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            while (n != 0) {
                int k = 0;
                for (int j = 0; fibo(j) <= n; j++) {
                    k = j;
                }
                list.add(fibo(k));
                n -=fibo(k);
            }

            Collections.sort(list,(o1, o2) -> o1-o2);

            for (Integer i : list) {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }

    static int fibo(int n) {

        if (n <= 1)
            return n;
        else if (dp[n] != 0) {
            return dp[n];
        } else
            return dp[n] = fibo(n - 1) + fibo(n - 2);
    }
}
