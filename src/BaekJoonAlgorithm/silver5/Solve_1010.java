package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class Solve_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(comb(M, N));
        }
    }

    public static long comb(int n , int  r){
        long result = 1;
        for(int i =0; i<r;i++){
            result *= (n-i);;
            result /= (i+1);
        }
        return result;
    }
}
