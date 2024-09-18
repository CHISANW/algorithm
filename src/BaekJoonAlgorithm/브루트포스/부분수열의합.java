package BaekJoonAlgorithm.브루트포스;

import java.util.Scanner;

public class 부분수열의합 {
    static boolean[] check;
    static int[] arr;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        check = new boolean[2000001];

        dfs(0, 0);

        for (int i = 1; i < 2000001; i++) {
            if (!check[i]) {
                System.out.println(i);
                return;
            }
        }

    }

    static void dfs(int depth, int sum) {
        if (depth == n) {
            check[sum] = true;
            return;
        }

        dfs(depth + 1, sum);
        dfs(depth + 1, sum + arr[depth]);
    }
}
