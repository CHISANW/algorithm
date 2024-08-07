package BaekJoonAlgorithm.그리디;

import java.util.*;

public class 수리공항승 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int count = 0;
        int end = 0;

        for (int i =0; i<n;i++){
            if (arr[i] > end){
                end = arr[i] + l -1;
                count++;
            }
        }

        System.out.println(count);

    }
}
