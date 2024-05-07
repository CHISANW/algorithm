package BaekJoonAlgorithm.재귀호출;

import java.util.Scanner;

public class N과M_1 {
    static int n ,m;
    static int[] numbers;
    static int[] output;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        n = stdIn.nextInt();
        m = stdIn.nextInt();

        output = new int[m];
        check = new boolean[n];

        perm(0);
        System.out.println(sb);
    }

    static void perm(int depth){
        if (depth==m){
            for (int i =0;i<m;i++)
                sb.append(output[i]+" ");
            sb.append("\n");
            return;
        }

        for (int i =0;i<n;i++){

            if (!check[i]) {
                check[i]=true;
                output[depth] = i+1;
                perm(depth + 1);
                check[i] = false;
            }
        }
    }
}
