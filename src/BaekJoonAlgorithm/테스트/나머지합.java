package BaekJoonAlgorithm.테스트;

import java.util.Scanner;

public class 나머지합 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] arr = new int[N+1];
        for (int i =1;i<=N;i++){
            arr[i] = stdIn.nextInt();
        }

        int[] accRemainCount =new int[M];
        int currentRemain = 0;
        accRemainCount[currentRemain]++;
        long ans = 0;
        for (int i= 1;i<=N;i++){
            currentRemain = (currentRemain+arr[i])%M;
            ans+= accRemainCount[currentRemain];
            accRemainCount[currentRemain]++;
        }
        System.out.println(ans);
    }
}
