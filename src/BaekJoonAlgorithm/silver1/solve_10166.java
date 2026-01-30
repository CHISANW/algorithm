package BaekJoonAlgorithm.silver1;

import java.util.HashSet;
import java.util.Scanner;

public class solve_10166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        boolean[][] vist = new boolean[d2+1][d2+1];
        int result = 0;
        for(int i = d1; i<=d2; i++){
            for(int k = 1; k<=i;k++){
                int g = gcd(k, i);
                int num = i / g;
                int den = k / g;

                if(!vist[num][den]){
                    vist[num][den] = true;
                    result++;
                }
            }
        }

        System.out.println(result);

    }

    static int gcd(int a, int b){
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
