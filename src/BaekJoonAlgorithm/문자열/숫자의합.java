package BaekJoonAlgorithm.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 11720번
 */
public class 숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int result=0;
        String s1 = br.readLine();

        for (int i=0;i<s1.length();i++){
            int num = Integer.parseInt(String.valueOf(s1.charAt(i)));
            result+=num;
        }
        System.out.println(result);
        br.close();
    }
}
