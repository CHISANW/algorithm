package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_1969 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] dna = new String[N];
        for (int i = 0; i < N; i++) dna[i] = br.readLine().trim();

        StringBuilder consensus = new StringBuilder();
        int totalDistance = 0;

        char[] order = {'A', 'C', 'G', 'T'};

        for (int col = 0; col < M; col++) {
            int[] cnt = new int[4]; // A,C,G,T

            for (int row = 0; row < N; row++) {
                char ch = dna[row].charAt(col);
                if (ch == 'A') cnt[0]++;
                else if (ch == 'C') cnt[1]++;
                else if (ch == 'G') cnt[2]++;
                else cnt[3]++; // 'T'
            }

            int bestIdx = 0;
            for (int i = 1; i < 4; i++) {
                if (cnt[i] > cnt[bestIdx]) bestIdx = i;
                // 동률이면 사전순(A<C<G<T) 유지 => bestIdx 그대로
            }

            consensus.append(order[bestIdx]);
            totalDistance += (N - cnt[bestIdx]);
        }

        System.out.println(consensus);
        System.out.println(totalDistance);
    }
}
