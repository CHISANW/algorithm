package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solve_13022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 길이가 최소 4가 아니면 올바른 단어가 될 수 없음
        if (s == null || s.length() < 4) {
            System.out.println(0);
            return;
        }

        int idx = 0;
        int n = s.length();
        boolean valid = true;

        while (idx < n) {
            // 현재 묶음에서 각 문자 개수 세기
            int cntW = 0, cntO = 0, cntL = 0, cntF = 0;

            // w 세기
            while (idx < n && s.charAt(idx) == 'w') {
                cntW++;
                idx++;
            }
            if (cntW == 0) { // w가 하나도 없으면 실패
                valid = false;
                break;
            }

            // o 세기
            for (int i = 0; i < cntW; i++) {
                if (idx >= n || s.charAt(idx) != 'o') {
                    valid = false;
                    break;
                }
                idx++;
                cntO++;
            }
            if (!valid || cntO != cntW) {
                valid = false;
                break;
            }

            // l 세기
            for (int i = 0; i < cntW; i++) {
                if (idx >= n || s.charAt(idx) != 'l') {
                    valid = false;
                    break;
                }
                idx++;
                cntL++;
            }
            if (!valid || cntL != cntW) {
                valid = false;
                break;
            }

            // f 세기
            for (int i = 0; i < cntW; i++) {
                if (idx >= n || s.charAt(idx) != 'f') {
                    valid = false;
                    break;
                }
                idx++;
                cntF++;
            }
            if (!valid || cntF != cntW) {
                valid = false;
                break;
            }
        }

        System.out.println(valid ? 1 : 0);
    }
}
