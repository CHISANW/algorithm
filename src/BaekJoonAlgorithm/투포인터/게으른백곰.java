package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 게으른백곰 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();        // 양동이의 개수
        int K = stdIn.nextInt();        // 떨어진 칸

        int[] arr = new int[10000001]; // 좌표는 0부터 100만까지이므로 배열의 크기를 1000001로 설정
        int max = 0;
        for (int i = 0; i < N; i++) {
            int g = stdIn.nextInt();   // 얼음 양
            int x = stdIn.nextInt();   // 좌표
            max = Math.max(x, max);
            arr[x] = g;
        }

        int currentCount = 0;
        // 초기 구간 설정
        for (int i = 0; i <= K * 2; i++) {
            currentCount += arr[i];
        }

        int ans = currentCount;
        // 투 포인터 알고리즘을 이용하여 구간을 이동하며 최대값 찾기
        for (int i = 1; i <= max - K; i++) {
            currentCount -= arr[i - 1];
            currentCount += arr[i + K * 2];
            ans = Math.max(ans, currentCount);
        }
        System.out.println(ans);
    }
}
