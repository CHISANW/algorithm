package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Scanner;

public class 나무자르기 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] arr = new int[N];
        for (int i =0; i<N;i++){
            arr[i] = stdIn.nextInt();
        }

        int l = 0, r = 1000000000, ans=-1;
        while (l<=r){
            int m  = (l+r)/2;
            if (isPossible(arr,m,M)){
                ans = m;
                l = m+1;
            }else
                r = m-1;
        }

        System.out.println(ans);
    }
    static boolean isPossible(int[] heights, int cutHeight, int thresholdHeight) {
        long sum = 0;
        for (int h : heights)
            if (h > cutHeight) sum += h - cutHeight;
        return sum >= thresholdHeight;
    }
}
