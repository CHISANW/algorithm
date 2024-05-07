package BaekJoonAlgorithm.재귀호출;

import java.util.Arrays;
import java.util.Scanner;

public class N과M_6 {
    static int n , m;
    static int[] numbers;
    static boolean[] check;
    static int[] output;

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        n= stdIn.nextInt();
        m= stdIn.nextInt();

        numbers = new int[n];
        check = new boolean[n];
        output = new int[n];

        for (int i =0;i<n;i++){
            numbers[i] = stdIn.nextInt();
        }

        Arrays.sort(numbers);

        perm(0,0);
    }

    public static void perm(int depth, int start){
        StringBuilder sb = new StringBuilder();
        if (depth == m){
            for (int i =0;i<m;i++){
                sb.append(output[i]+" ");
            }
            System.out.println(sb);
            return;
        }

        for (int i = start; i<n;i++){
            check[i] = false;
            output[depth] = numbers[i];
            perm(depth+1,i+1);
            check[i] = true;
        }
    }
}
