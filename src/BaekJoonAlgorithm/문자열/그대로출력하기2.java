package BaekJoonAlgorithm.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class 그대로출력하기2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
