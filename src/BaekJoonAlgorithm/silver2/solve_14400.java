package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_14400 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x);
        Arrays.sort(y);

        int midX = x[n/2];
        int midY = y[n/2];

        long result = 0;

        for(int i =0; i<n;i++){
            result += Math.abs(x[i] - midX);
            result += Math.abs(y[i] - midY);
        }

        System.out.println(result);
    }
}
