package BaekJoonAlgorithm.투포인터;

import java.util.Arrays;
import java.util.Scanner;

public class 수고르기 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] arr = new int[N];

        for (int i =0;i<N;i++){
            arr[i] = stdIn.nextInt();
        }

        Arrays.sort(arr);

        int ansDiff = arr[N-1]-arr[0];
        int pairIndex = 0;

        for (int i =0;i<N;i++){
            while (arr[pairIndex]-arr[i]<M && pairIndex<N-1)
                pairIndex++;
            int diff = arr[pairIndex] - arr[i];
            if (diff>=M)
                ansDiff = Math.min(ansDiff,diff);
        }
        System.out.println(ansDiff);
    }
}
