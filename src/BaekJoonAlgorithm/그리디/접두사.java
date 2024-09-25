package BaekJoonAlgorithm.그리디;

import java.util.*;

public class 접두사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i =0;i<n;i++){
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        int max = n;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1].startsWith(arr[i])) {
                max--;
            }
        }

        System.out.println(max);
    }
}
