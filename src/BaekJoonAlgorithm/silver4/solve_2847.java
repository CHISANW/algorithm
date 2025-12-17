package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_2847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i =n-2;i>=0;i--){
            while (arr[i] >= arr[i+1]){
                count++;
                arr[i]--;
            }
        }

        System.out.println(count);
    }
}
