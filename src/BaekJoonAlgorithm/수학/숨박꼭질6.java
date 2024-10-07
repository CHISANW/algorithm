package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 숨박꼭질6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];

        for (int i =0; i<n;i++){
            int a = sc.nextInt();
            arr[i] = Math.abs(s- a);
        }

        int gcd = arr[0];
        for (int i =1; i<arr.length;i++){
            gcd = GCD(gcd,arr[i]);
        }

        System.out.println(gcd);
    }

    static int GCD(int a, int b){
        if (b==0) return a;
        else return GCD(b,a%b);
    }
}
