package BaekJoonAlgorithm.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 2231번
 */
public class 분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int[] arr = new int[s];

        for (int i = 1,j=0; i < s; i++) {
            int sum = i;

            String token1 = String.valueOf(i);
            for (int a = 0; a < token1.length(); a++) {
                int b = Integer.parseInt(String.valueOf(token1.charAt(a)));
                sum += b;
            }
            if (sum == s) {
                arr[j]=i;
                j++;
            }
        }

        System.out.println(arr[0]);
    }
}
