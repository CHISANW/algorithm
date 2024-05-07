package BaekJoonAlgorithm.재귀호출;

import java.util.*;

public class N과M_5 {
    static int n, m;
    static int[] numbers;
    static boolean[] check;
    static int[] output;

    public static void main(String[] arg){
        Scanner stdIn = new Scanner(System.in);
        n = stdIn.nextInt();
        m = stdIn.nextInt();

        numbers = new int[n];
        output = new int[m];
        check = new boolean[n];

        for (int i =0;i<n;i++){
            numbers[i] = stdIn.nextInt();
        }

        Arrays.sort(numbers);       // 사전순으로 정렬

        perm(0);
    }

    public static void perm(int depth){
        StringBuilder sb = new StringBuilder();
        if (depth == m) {
            for(int i = 0; i < m; i++) {
                sb.append(output[i]+" ");
            }
            System.out.println(sb);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                output[depth] = numbers[i];
                perm(depth + 1);
                check[i] = false;
            }
        }
    }
}
