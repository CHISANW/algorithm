package BaekJoonAlgorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int i = 2;

        while (true) {
            if (n % i == 0) {
                n=n/i;
                sb.append(i+"\n");
            } else i++;

            if (n < i) break;
        }
        System.out.println(sb);
        br.close();
    }
}

