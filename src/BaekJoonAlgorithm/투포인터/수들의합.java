package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 수들의합 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = stdIn.nextInt();
        }

        int ans= 0;
        int rightIndex = 0;
        int currentSum = arr[0];
        for (int i =0;i<N;i++){
            while (currentSum<M&&rightIndex<N-1)
                currentSum+=arr[++rightIndex];
            if (currentSum==M) ans++;
                currentSum-=arr[i];

        }

        System.out.println(ans);
    }
}
