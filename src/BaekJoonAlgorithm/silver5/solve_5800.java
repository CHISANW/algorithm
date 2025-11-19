package BaekJoonAlgorithm.silver5;

import java.util.Arrays;
import java.util.Scanner;

public class solve_5800 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1 ;i<=n; i++){
            System.out.println("Class "+i);
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(int j=0;j<k;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int gap = 0;
            for(int j=0;j<arr.length-1;j++){
                gap = Math.max(gap,arr[j+1]-arr[j]);
            }
            System.out.println("Max "+arr[arr.length-1]+", Min "+arr[0]+", Largest gap "+gap);
        }

    }
}
