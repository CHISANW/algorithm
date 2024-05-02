package BaekJoonAlgorithm.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        int[] atm = new int[N+1];

        for (int i =1;i<=N;i++){
            atm[i] = stdIn.nextInt();
        }

        Arrays.sort(atm);

        int[] sum = new int[N+1];
        for (int i =1;i<=N;i++){
            sum[i] = sum[i-1]+atm[i];
        }

        // 일반 합배열을 구하고 for문을통해 문제 풀이
        int ans = 0;
        for (int i =1;i<=N;i++){
            ans+=sum[i];
        }

        // Stream을 사용한 문제풀이
        int streamAns = Arrays.stream(sum).sum();
        System.out.println(streamAns);

        System.out.println(ans);
    }
}
