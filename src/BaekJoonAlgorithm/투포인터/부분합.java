package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 부분합 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int S = stdIn.nextInt();

        int[] sumArr = new int[N];

        for (int i =0;i<N;i++){
            sumArr[i] = stdIn.nextInt();
        }

        int rightIndex = 0;
        int ansLength =N+1;
        int currentSum= sumArr[0];

        for (int i=0;i<N;i++){
            while (currentSum<S &&rightIndex<N-1)
                currentSum += sumArr[++rightIndex];
            if (currentSum>=S)
                ansLength=Math.min(ansLength,rightIndex-i+1);
            currentSum-=sumArr[i];
        }

        if (ansLength>N) ansLength=0;

        System.out.println(ansLength);
    }
}
