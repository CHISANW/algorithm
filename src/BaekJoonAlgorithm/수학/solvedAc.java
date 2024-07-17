package BaekJoonAlgorithm.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solvedAc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] arr = new int[n];

        float avg = (float) ((float)n * 0.15);

        for(int i =0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine().trim());
        }

        Arrays.sort(arr);

        int round = (int)Math.round(avg);
        int sum =0;
        int count = 0;
        for(int i = round ; i<n-round;i++){
            sum += arr[i];
            count++;
        }

        System.out.println(Math.round((float)sum / (float)count));
    }
}
