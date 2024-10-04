package BaekJoonAlgorithm.백트래킹;

import java.util.Scanner;

public class 근손실 {
    static int n, m;
    static int count = 0;
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        visited = new boolean[n];

        backTracking(0,500);

        System.out.println(count);
    }

    static void backTracking(int depth, int h ) {
        if (depth == n) {
            if (h >= 500) {
                count++;
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && h+arr[i]-m>=500) {
                visited[i] = true;
                backTracking(depth + 1, h + arr[i] - m);
                visited[i] = false;
            }
        }
    }
}
