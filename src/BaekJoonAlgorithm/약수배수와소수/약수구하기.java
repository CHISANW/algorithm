package BaekJoonAlgorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] divisors = new int[a];

        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                divisors[count] = i;
                count++;
            }
        }
        if (count >= b) {
            sb.append(divisors[b - 1]);
        } else {
            sb.append(0);
        }

        System.out.println(sb);
        br.close();
    }
}
