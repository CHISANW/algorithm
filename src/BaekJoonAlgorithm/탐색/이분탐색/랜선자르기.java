package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Scanner;

public class 랜선자르기 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int k = stdIn.nextInt();
        int n = stdIn.nextInt();

        int[] arr = new int[k];

        for (int i =0 ;i<k;i++){
            arr[i] = stdIn.nextInt();
        }

        long l =1, r=(1l<<31)-1, ans = -1;

        while (l<=r){
            long m = l+(r-l)/2;

            if (isCalculateCount(arr, m)>=n){
                ans = m;
                l = m+1;
            }else
                r = m -1;
        }

        System.out.println(ans);
    }

    static int isCalculateCount(int[] arr, long length) {
        int sum = 0;
        for (int h : arr){
            sum+= h / length;
        }
        return sum;
    }
}
