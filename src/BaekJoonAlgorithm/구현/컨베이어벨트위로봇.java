package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 컨베이어벨트위로봇 {
    static int n, k;
    static int[] arr;
    static boolean[] robots;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();    // 컨테이어 벨트 길이
        k = sc.nextInt();    // 내구도 0 종료 수
        arr = new int[n * 2];
        robots = new boolean[n * 2];

        for (int i = 0; i < n * 2; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;

        do {
            count++;
            moveConvey();
            moveRobot();
            loadRobot();
        } while (checkZeroDurability());

        System.out.println(count);

    }

    static void moveConvey() {
        int arrTemp = arr[n * 2 - 1];
        for (int i = n * 2 - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = arrTemp;

        for (int i = n * 2 - 1; i > 0; i--) {
            robots[i] = robots[i - 1];
        }
        robots[0] = false;

        removeRobot();
    }

    static void moveRobot() {
        for (int i = n - 2; i >= 0; i--) {
            if (robots[i] && !robots[i + 1] && arr[i + 1] > 0) {
                robots[i + 1] = true;
                robots[i] = false;
                arr[i + 1]--;
            }
        }
        removeRobot();
    }

    static void loadRobot() {
        if (arr[0] > 0 && !robots[0]) {
            robots[0] = true;
            arr[0]--;
        }
    }

    static boolean checkZeroDurability() {
        int zeroCount = 0;
        for (int i = 0; i < n * 2; i++) {
            if (arr[i] == 0) zeroCount++;
        }
        return zeroCount < k;
    }

    private static void removeRobot() {
        if (robots[n - 1]) {
            robots[n - 1] = false;
        }
    }
}
