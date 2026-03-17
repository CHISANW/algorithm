package BaekJoonAlgorithm.Re_silver.level3;

import java.util.Arrays;
import java.util.Scanner;

public class 소수찾기 {
    static boolean[] isPrime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        prime(n);

        StringBuilder sb = new StringBuilder();
        for(int i = m; i<=n;i++){
            if(isPrime[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);

    }

    static void prime(int n){
        isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i*i<=n;i++){
            if(isPrime[i]){
                for(int j = i*i; j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }

    }
}
