package BaekJoonAlgorithm.랜덤_마라톤.Solve_63;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem_32777 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine().trim());

        final int TOTAL_STATIONS = 43;

        StringBuilder sb = new StringBuilder();
        while (Q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int inner, outer;

            if (a < b) {
                inner = b - a;
                outer = TOTAL_STATIONS - (b - a);
            } else {
                inner = TOTAL_STATIONS - (a - b);
                outer = a - b;
            }

            if (inner < outer) {
                sb.append("Inner circle line\n");
            } else if (inner > outer) {
                sb.append("Outer circle line\n");
            } else {
                sb.append("Same\n");
            }
        }

        System.out.print(sb);
    }
}