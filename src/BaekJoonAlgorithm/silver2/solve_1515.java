package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_1515 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int idx = 0;   // S에서 현재 보고 있는 위치
        int N = 1;

        while (true) {
            String cur = String.valueOf(N);

            for (int i = 0; i < cur.length(); i++) {
                if (idx < S.length() && cur.charAt(i) == S.charAt(idx)) {
                    idx++;
                }
            }

            // S의 모든 문자를 다 찾았으면 종료
            if (idx == S.length()) {
                System.out.println(N);
                break;
            }

            N++;
        }
    }
}
