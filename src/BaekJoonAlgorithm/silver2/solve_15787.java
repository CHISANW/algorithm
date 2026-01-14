package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class solve_15787 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 기차 수
        int M = Integer.parseInt(st.nextToken()); // 명령 수

        int[] train = new int[N + 1]; // 기차 상태 (1번부터 사용)

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            if (cmd == 1) {
                int t = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                train[t] |= (1 << (x - 1));

            } else if (cmd == 2) {
                int t = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                train[t] &= ~(1 << (x - 1));

            } else if (cmd == 3) {
                int t = Integer.parseInt(st.nextToken());
                train[t] <<= 1;
                train[t] &= (1 << 20) - 1;

            } else if (cmd == 4) {
                int t = Integer.parseInt(st.nextToken());
                train[t] >>= 1;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            set.add(train[i]);
        }

        System.out.println(set.size());
    }
}
