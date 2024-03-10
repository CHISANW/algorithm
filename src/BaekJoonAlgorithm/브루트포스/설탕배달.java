package BaekJoonAlgorithm.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 2839번
 */
public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); //11

        int count = 0;

        count += n / 5;
        n %= 5;

        while (n % 3 != 0 && count > 0) {
            n += 5;
            count--;
        }
        if (n % 3 == 0) {
            count += n / 3;
        } else {
            count = -1;
        }

        sb.append(count);
        System.out.println(sb);
        br.close();
    }
}
