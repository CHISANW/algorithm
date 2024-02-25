package BaekJoonAlgorithm.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 5622번
 */
public class 다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result=0;

        String s = br.readLine().toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result += (c - 'A') / 3 + 3;
            if (c == 'S' || c == 'V' || c == 'Y' || c == 'Z')
                result--;
        }

        System.out.println(result);
    }
}
