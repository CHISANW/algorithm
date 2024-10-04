package BaekJoonAlgorithm.그리디;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 에너지드링크 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        // 최대 양 계산
        double ans = arr[0];

        for (int i = 1; i < n; i++) {
            ans += arr[i] / 2.0;
        }

        // 소수점 5자리까지 출력
        System.out.printf("%.6f\n", ans);
    }
}
