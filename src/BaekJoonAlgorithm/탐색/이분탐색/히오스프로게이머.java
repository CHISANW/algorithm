package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.*;

public class 히오스프로게이머 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long answer = binarySearch(arr, k);

        System.out.println(answer);

    }

    static long binarySearch(long[] arr, long k) {
        Arrays.sort(arr);
        long left = arr[0];
        long right = arr[arr.length - 1] + k;
        long ans = left;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (canLevelUp(arr,mid,k)){
                left = mid + 1;
                ans = mid;
            }else{
                right = mid-1;
            }
        }

        return ans;
    }

    static boolean canLevelUp(long[] arr , long leveUp, long limit){

        long can = 0;
        for (int i =0; i<arr.length;i++){
            if (arr[i] < leveUp){
                can += (leveUp - arr[i]);
            }
            if (can > limit){
                return false;
            }
        }
        return can <= limit;
    }
}
