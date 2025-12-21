package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solve_1758 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            int tip = arr[n - 1 - i] - i;
            if (tip > 0) {
                sum += tip;
            }
        }

        System.out.println(sum);
    }

}
