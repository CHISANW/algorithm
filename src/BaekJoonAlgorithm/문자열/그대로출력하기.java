package BaekJoonAlgorithm.문자열;

import java.io.*;

/**
 * 문제번호 11718번
 */
public class 그대로출력하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            sb.append(str).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
