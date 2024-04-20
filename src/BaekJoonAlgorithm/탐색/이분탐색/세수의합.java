package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 세수의합 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();


        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = stdIn.nextInt();
        }

        int[] sum = new int[n*(n+1)/2];
        int sumIndex = 0;
        for (int i =0;i<n;i++){
            for (int j = i;j<n;j++){
                sum[sumIndex++] = arr[i]+arr[j];
            }
        }
        Arrays.sort(sum);

        int ans = -1;

        for (int i =0;i<n;i++){
            for (int j = 0;j<n;j++){
                int target  = arr[i]-arr[j];
                if (isExist(sum,target))
                    ans = Math.max(ans, arr[i]);
            }
        }

        System.out.println(ans);

    }

    private static boolean isExist(int[] arr, int target) {
        int l = 0, r= arr.length-1;
        while (l<=r){
            int m = (l+r)/2;
            if (arr[m]<target)
                l = m + 1;
            else if (arr[m] > target) r = m - 1;
            else return true;
        }
        return false;
    }
}
