package BaekJoonAlgorithm.재귀호출;

import java.util.Arrays;
import java.util.Scanner;

public class N과M_8 {
    static int n ,m;
    static int[] numbers;
    static int[] output;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        n = stdIn.nextInt();
        m = stdIn.nextInt();

        numbers= new int[n];
        output= new int[m];
        for (int i =0;i<n;i++){
            numbers[i] = stdIn.nextInt();
        }

        Arrays.sort(numbers);

        perm(0,0);
        System.out.println(sb);
    }
    static void perm(int depth, int start){
        if (depth==m){
            for (int i =0;i<m;i++)
                sb.append(output[i]+ " ");
            sb.append("\n");
            return;
        }

        for (int i =start; i<n;i++){
            output[depth] = numbers[i];
            perm(depth+1,i);
        }
    }
}
