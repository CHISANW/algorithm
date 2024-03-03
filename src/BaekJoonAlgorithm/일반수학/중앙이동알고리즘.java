package BaekJoonAlgorithm.일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 2903번
 * 해결방법 : 점은 2의 n승 으로 늘어난다. 1+2의n승의 제곱으로풀이
 */
public class 중앙이동알고리즘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        int b = (int)Math.pow(2, i);
        int result = (int) Math.pow((1 + b), 2);

        System.out.println(result);
        br.close();
    }
}
