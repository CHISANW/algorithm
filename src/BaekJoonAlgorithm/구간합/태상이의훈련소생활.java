package BaekJoonAlgorithm.구간합;

import java.util.Scanner;

public class 태상이의훈련소생활 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        int[] origin = new int[n+1];

        for(int i =1;i<=n;i++){
            origin[i]=stdIn.nextInt();
        }
        int[] delta = new int[n+2];

        while (m-- >0){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            int k = stdIn.nextInt();
            delta[a] += k;
            delta[b+1] -=k;
        }

        int[] accDelta = new int[n+1];
        for (int i =1;i<=n;i++){
            accDelta[i] = accDelta[i-1]+delta[i];
        }

        for (int i =1 ;i<=n;i++){
            System.out.print(accDelta[i]+origin[i]+" ");
        }
        System.out.println();
    }
}
