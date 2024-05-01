package BaekJoonAlgorithm.테스트;

import java.util.Arrays;
import java.util.Scanner;

public class 먹을것인가먹힐것인가 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int T = stdIn.nextInt();        //테스트 케이스

        while (T-->0){
            int N = stdIn.nextInt();
            int M = stdIn.nextInt();

            int[] a = new int[N];
            for (int i = 0; i < N; i++)
                a[i] = stdIn.nextInt();

            int[] b = new int[M];
            for (int i = 0; i < M; i++)
                b[i] = stdIn.nextInt();


            Arrays.sort(a);
            Arrays.sort(b);

            int ans = 0;
            int bi = 0;
            for (int i =0;i<N;i++){
                while (bi<M && b[bi]<a[i]) bi++;
                ans += bi;
            }
            System.out.println(ans);
            }
        }
    }