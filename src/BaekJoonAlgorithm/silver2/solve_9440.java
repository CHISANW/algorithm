package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_9440 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int zeroCount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) zeroCount++;
                else break;
            }

            if (zeroCount == 1) {
                int tmp = arr[0];
                arr[0] = arr[2];
                arr[2] = tmp;
            } else if (zeroCount >= 2) {
                int tmp = arr[0];
                arr[0] = arr[zeroCount];
                arr[zeroCount] = tmp;

                tmp = arr[1];
                arr[1] = arr[zeroCount + 1];
                arr[zeroCount + 1] = tmp;
            }

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) sb1.append(arr[i]);
                else sb2.append(arr[i]);
            }

            long num1 = Long.parseLong(sb1.toString());
            long num2 = Long.parseLong(sb2.toString());

            sb.append(num1 + num2).append('\n');
        }

        System.out.print(sb);
    }
}
