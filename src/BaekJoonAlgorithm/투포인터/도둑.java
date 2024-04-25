package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 도둑 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int T = stdIn.nextInt();        // 테스트 케이스

        while (T-->0){

            int N = stdIn.nextInt();        // 집의 개수
            int M = stdIn.nextInt();        // 연속된 집의 개수
            int K = stdIn.nextInt();        // 훔칠 수 있는 돈의수

            int[] money =new int[N];
            for (int i=0;i<N;i++){
                money[i] = stdIn.nextInt();
            }

            int currentCount = 0;
            for (int i =0;i<M;i++){
                currentCount+=money[i];
            }

            int ans = (currentCount < K ? 1 : 0);
            if (N != M) {
                for (int i = 1; i < N; i++) {
                    currentCount -= money[i - 1];
                    currentCount += money[(i + M - 1) % N];
                    if (currentCount < K) ans++;
                }
            }
            System.out.println(ans);

        }
    }
}
