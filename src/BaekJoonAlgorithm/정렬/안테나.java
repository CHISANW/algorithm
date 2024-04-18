package BaekJoonAlgorithm.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 안테나 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int[] xs = new int[N];
        for (int i = 0; i < N; i++)
            xs[i] = stdIn.nextInt();

        Arrays.sort(xs);

        // 가장 왼쪽 집에 안테나를 설치했을 때 거리 합을 구한다.
        int optimalAntenaX = xs[0];
        long optimalDistanceSum = 0;
        for (int i = 0; i < N; i++)
            optimalDistanceSum += xs[i] - xs[0];

        long pastDistanceSum = 0;

        for (int i = 1; i < N; i++) {
            int movedDistance = xs[i] - xs[i - 1];
            long currentDistanceSum = pastDistanceSum;
            currentDistanceSum += (long)i * movedDistance;
            currentDistanceSum -= (long)(N - i) * movedDistance;
            if (currentDistanceSum < optimalDistanceSum) {
                optimalAntenaX = xs[i];
                optimalDistanceSum = currentDistanceSum;
            }
            pastDistanceSum = currentDistanceSum;
        }

        System.out.println(optimalAntenaX);
    }
}
