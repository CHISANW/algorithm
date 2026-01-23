package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_1421 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        int maxLen = 0;

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
            if (trees[i] > maxLen) {
                maxLen = trees[i];
            }
        }

        long answer = 0;

        // 1부터 가장 긴 나무 길이까지 길이 L을 기준으로 탐색
        for (int L = 1; L <= maxLen; L++) {
            long totalProfit = 0;

            for (int tree : trees) {
                if (tree < L) continue;

                int count = tree / L;  // 해당 길이로 얻을 수 있는 토막 수
                int cuts;
                if (tree % L == 0) {
                    cuts = count - 1;  // 딱 나누어 떨어지면 count-1번 자름
                } else {
                    cuts = count;      // 나머지 있으면 count번 자름
                }

                long revenue = (long) count * L * W;
                long cost = (long) cuts * C;
                long profit = revenue - cost;

                if (profit > 0) {
                    totalProfit += profit;
                }
            }

            if (totalProfit > answer) {
                answer = totalProfit;
            }
        }

        System.out.println(answer);
    }
}


