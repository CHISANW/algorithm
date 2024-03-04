package BaekJoonAlgorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 5086번
 */
public class 배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break;

            if (b % a == 0) sb.append("factor"+"\n");
            else if (a % b == 0) sb.append("multiple"+"\n");
            else sb.append("neither"+"\n");
        }

        System.out.println(sb);
        br.close();
    }
}
