package BaekJoonAlgorithm.재귀호출;

import java.util.*;

/**
 * 문제번호 2747번
 */
public class 피보나치수 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        int result = fibo(N);
        System.out.println(result);
    }

    static int[] cache = new int[50];
    static int fibo(int N){
        if (N==1||N==2) return 1;
        if (cache[N]!=0) return cache[N];

        cache[N] =fibo(N-1)+fibo(N-2);
        return cache[N];
    }
}
