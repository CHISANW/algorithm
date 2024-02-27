package BaekJoonAlgorithm.two차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 10798번
 */
public class 세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] array = new String[5];

        // 배열 입력 받기
        for (int i = 0; i < 5; i++) {
            array[i] = br.readLine();
        }

        // 세로로 읽어서 출력
        int maxLength = 0;
        for (String s : array) {
            maxLength = Math.max(maxLength, s.length());
        }

        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < array[i].length()) {
                    sb.append(array[i].charAt(j));
                }
            }
        }

        System.out.println(sb);
        br.close();
    }
}
