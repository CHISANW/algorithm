package BaekJoonAlgorithm.그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 로프 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr,(o1,o2) -> o2-o1);

        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, arr[i]*(i+1));
        }
        System.out.println(max);

    }
}
