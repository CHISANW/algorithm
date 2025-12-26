package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_10211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] sumArr = new int[n];
            for(int i =0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            sumArr[0] = arr[0];
            for (int i = 1; i<n;i++){
                sumArr[i] = arr[i] + sumArr[i-1];
            }

            int max =sumArr[0];
            for(int i =0;i<n-1;i++){
                for(int j = i+1; j<n;j++){
                    max = Math.max(max, Math.max(sumArr[j],sumArr[j]-sumArr[i]));
                }
            }
            System.out.println(max);
        }
    }
}
