package BaekJoonAlgorithm.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 9086번
 */
public class 문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i=0;i<t;i++){
            String s = br.readLine();
            char start = s.charAt(0);
            char last = s.charAt( s.length()-1);
            sb.append(start).append(last).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
