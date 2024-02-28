package BaekJoonAlgorithm.일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 2745번
 */
public class 진법변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String s = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int j=0;
        int sum=0;

        for (int i = s.length() - 1; i >= 0; i--, j++) {
            int c;
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                c = ch - '0';
            } else {
                c = ch - 'A' + 10;
            }
            sum += c * Math.pow(b, j);
        }
        System.out.println(sum);
    }
}
