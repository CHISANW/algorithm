package BaekJoonAlgorithm.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 1436번
 */
public class 영화감독숌 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;

            if(String.valueOf(num).contains("666")) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println(num);
    }
}
