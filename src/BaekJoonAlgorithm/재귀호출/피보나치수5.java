package BaekJoonAlgorithm.재귀호출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5 {
    static long[] cache = new long[30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N ==0){
            System.out.println(0);
        }else {
            long fibo = fibo(N);
            System.out.println(fibo);
        }
    }

    static long fibo(int node){
        if (node==1||node==2) return 1;
        if (cache[node]!=0) return cache[node];

        return cache[node] = fibo(node-1)+fibo(node-2);
    }
}
