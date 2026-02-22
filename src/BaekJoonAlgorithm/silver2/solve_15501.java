package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_15501 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // b에서 a[0]이 있는 위치 찾기 (원소는 1..n 한 번씩이라 최대 한 곳)
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (b[i] == a[0]) {
                idx = i;
                break;
            }
        }

        // 혹시 못 찾으면 (이론상 없지만) bad puzzle
        if (idx == -1) {
            System.out.println("bad puzzle");
            return;
        }

        boolean forwardOk = true;
        boolean backwardOk = true;

        // 정방향: a[i] == b[(idx + i) % n] ?
        for (int i = 0; i < n; i++) {
            if (a[i] != b[(idx + i) % n]) {
                forwardOk = false;
                break;
            }
        }

        // 역방향: a[i] == b[(idx - i + n) % n] ?
        for (int i = 0; i < n; i++) {
            if (a[i] != b[(idx - i + n) % n]) {
                backwardOk = false;
                break;
            }
        }

        if (forwardOk || backwardOk) {
            System.out.println("good puzzle");
        } else {
            System.out.println("bad puzzle");
        }
    }
}
