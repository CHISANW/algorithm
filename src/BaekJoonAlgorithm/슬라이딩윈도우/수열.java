package BaekJoonAlgorithm.슬라이딩윈도우;

import java.util.Scanner;

public class 수열 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int K = stdIn.nextInt();

        int[] arr = new int[N];
        for (int i =0;i < N;i++){
            arr[i] = stdIn.nextInt();
        }

        int slide = 0;

        for (int i =0;i<K;i++){
            slide+=arr[i];
        }

        int ans = slide;
        // 슬라이딩 윈도우
        for (int i =K;i<N;i++){
            slide = slide + arr[i] - arr[i - K];
            ans = Math.max(slide, ans);
        }

        System.out.println(ans);
    }
}
