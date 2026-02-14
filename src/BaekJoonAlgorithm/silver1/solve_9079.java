package BaekJoonAlgorithm.silver1;

import java.io.*;
import java.util.*;

public class solve_9079 {
    static final int FULL = (1 << 9) - 1; // 511

    // 8가지 뒤집기 연산 마스크
    static int[] masks = new int[8];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        initMasks();

        while (T-- > 0) {
            int start = 0;

            // 입력 → 비트마스크 변환
            for (int i = 0; i < 3; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 3; j++) {
                    String coin = st.nextToken();
                    if (coin.equals("T")) {
                        start |= (1 << (i * 3 + j));
                    }
                }
            }

            sb.append(bfs(start)).append("\n");
        }

        System.out.print(sb);
    }

    static void initMasks() {
        // 행 뒤집기 (3개)
        for (int i = 0; i < 3; i++) {
            int mask = 0;
            for (int j = 0; j < 3; j++) {
                mask |= (1 << (i * 3 + j));
            }
            masks[i] = mask;
        }

        // 열 뒤집기 (3개)
        for (int j = 0; j < 3; j++) {
            int mask = 0;
            for (int i = 0; i < 3; i++) {
                mask |= (1 << (i * 3 + j));
            }
            masks[3 + j] = mask;
        }

        // 대각선 2개
        int diag1 = 0; // (0,0),(1,1),(2,2)
        int diag2 = 0; // (0,2),(1,1),(2,0)

        for (int i = 0; i < 3; i++) {
            diag1 |= (1 << (i * 3 + i));
            diag2 |= (1 << (i * 3 + (2 - i)));
        }

        masks[6] = diag1;
        masks[7] = diag2;
    }

    static int bfs(int start) {
        if (start == 0 || start == FULL) return 0;

        boolean[] visited = new boolean[512];
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{start, 0});
        visited[start] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int state = cur[0];
            int depth = cur[1];

            for (int i = 0; i < 8; i++) {
                int next = state ^ masks[i];

                if (!visited[next]) {
                    if (next == 0 || next == FULL) {
                        return depth + 1;
                    }
                    visited[next] = true;
                    q.offer(new int[]{next, depth + 1});
                }
            }
        }

        return -1; // 불가능
    }
}
