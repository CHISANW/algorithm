package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 겹치는건싫어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i =0; i<n;i++){
            arr[i] =sc.nextInt();
        }
        int[] count = new int[100001];
        int left = 0, right = 0, maxLength = 0;

        while (right < n) {
            if (count[arr[right]] < k) {
                count[arr[right]]++;
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                count[arr[left]]--;
                left++;
            }
        }
        System.out.println(maxLength);
    }
}
