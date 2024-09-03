package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.*;

public class 과자나눠주기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] candies = new int[n];

        for (int i =0; i<n;i++){
            candies[i] = sc.nextInt();
        }

        Arrays.sort(candies);

        int left = 1;
        int right = candies[n-1];

        while (left <= right){
            int mid = (left+right)/2;

            int cnt = 0;
            for (int i =0; i<n;i++){
                if (candies[i] >= mid){
                    cnt += candies[i] /mid;
                }
            }

            if (cnt>=m){
                left = mid+1;
            }else
                right = mid-1;
        }
        System.out.println(right);
    }
}
