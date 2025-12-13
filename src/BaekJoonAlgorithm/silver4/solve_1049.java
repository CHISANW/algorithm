package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_1049 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 필요한 줄 수
        int M = Integer.parseInt(st.nextToken()); // 브랜드 수

        int minPackage = Integer.MAX_VALUE;
        int minSingle = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int pack = Integer.parseInt(st.nextToken());
            int single = Integer.parseInt(st.nextToken());

            minPackage = Math.min(minPackage, pack);
            minSingle = Math.min(minSingle, single);
        }

        int case1 = ((N + 5) / 6) * minPackage;              // 전부 패키지
        int case2 = (N / 6) * minPackage + (N % 6) * minSingle; // 혼합
        int case3 = N * minSingle;                           // 전부 낱개

        int answer = Math.min(case1, Math.min(case2, case3));
        System.out.println(answer);
    }
}
