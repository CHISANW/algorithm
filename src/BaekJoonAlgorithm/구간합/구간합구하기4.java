package BaekJoonAlgorithm.구간합;

import java.util.Scanner;

public class 구간합구하기4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] arr = new int[N+1];
        for (int i =1;i<=N;i++){
            arr[i]=stdIn.nextInt();
        }

        int[] sum = new int[N+1];
        for (int i =1;i<=N;i++){
            sum[i]= sum[i-1]+arr[i];
        }


        while (M-- > 0){
            int i = stdIn.nextInt();
            int j = stdIn.nextInt();
            System.out.println(sum[j]-sum[i-1]);
        }
    }
}
