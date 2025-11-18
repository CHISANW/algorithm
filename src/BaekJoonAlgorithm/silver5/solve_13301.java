package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_13301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        long[] fib = new long[81];
        fib[1] = 1;
        fib[2] = 2;

        for(int i = 3; i <= n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        long ans = 4*fib[n] + 2*fib[n-1];
        System.out.println(ans);

    }
}
