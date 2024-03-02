package BaekJoonAlgorithm.일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법변환2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                sb.append((char) (remainder + '0'));
            } else {
                sb.append((char) (remainder - 10 + 'A'));
            }
            N /= B;
        }

        System.out.println(sb.reverse());
        br.close();
    }
}
