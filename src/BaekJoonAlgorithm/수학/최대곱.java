package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 최대곱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = sc.nextInt();

        int div = s/k;
        int mod = s%k;

        long ans = 1;

        for (int i =0; i<mod;i++){
            ans *= (div + 1);
        }

        for (int i =mod; i<k;i++){
            ans *= div;
        }
        System.out.println(ans);
    }
}
