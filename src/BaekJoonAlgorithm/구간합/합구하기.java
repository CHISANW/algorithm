package BaekJoonAlgorithm.구간합;

import java.util.Scanner;

public class 합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] sum = new int[n+1];
        for(int i =1; i<=n;i++){
            int value = sc.nextInt();
            sum[i] = value + sum[i-1];
        }

        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();

        for(int i =0; i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int answer = sum[b] - sum[a-1];
            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}
