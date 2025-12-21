package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solve_11508 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);


        int sum = 0;
        int cnt = 0;

        for (int i = n - 1; i >= 0; i--) {
            cnt++;
            if (cnt % 3 != 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
