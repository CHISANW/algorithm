package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_10837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 총 라운드 수
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken()); // 쌍의 개수

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()); // 영희 점수
            int N = Integer.parseInt(st.nextToken()); // 동수 점수

            if (M == N) {
                sb.append("1\n");
                continue;
            }

            // gap: 점수차
            int gap = Math.abs(M - N);
            // 남은 라운드
            int rem = K - Math.max(M, N);

            if (M > N) {
                // 영희가 앞설 때
                // gap - rem <= 2이면 가능
                sb.append((gap - rem <= 2) ? "1\n" : "0\n");
            } else {
                // 동수가 앞설 때
                // gap - rem <= 1이면 가능
                sb.append((gap - rem <= 1) ? "1\n" : "0\n");
            }
        }

        System.out.print(sb.toString());
    }
}
