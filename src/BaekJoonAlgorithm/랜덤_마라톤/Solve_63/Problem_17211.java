package BaekJoonAlgorithm.랜덤_마라톤.Solve_63;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem_17211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int startMood = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double[][] P = new double[2][2];
        P[0][0] = Double.parseDouble(st.nextToken()); // good -> good
        P[0][1] = Double.parseDouble(st.nextToken()); // good -> bad
        P[1][0] = Double.parseDouble(st.nextToken()); // bad -> good
        P[1][1] = Double.parseDouble(st.nextToken()); // bad -> bad

        double[] v = new double[2];
        if (startMood == 0) {
            v[0] = 1.0;
            v[1] = 0.0;
        } else {
            v[0] = 0.0;
            v[1] = 1.0;
        }

        for (int i = 0; i < N; i++) {
            double[] next = new double[2];
            next[0] = v[0] * P[0][0] + v[1] * P[1][0];
            next[1] = v[0] * P[0][1] + v[1] * P[1][1];
            v = next;
        }

        int good = (int)Math.round(v[0] * 1000);
        int bad = (int)Math.round(v[1] * 1000);

        System.out.println(good);
        System.out.println(bad);
    }
}