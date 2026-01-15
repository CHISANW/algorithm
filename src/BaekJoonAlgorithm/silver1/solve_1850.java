package BaekJoonAlgorithm.silver1;

import java.util.Scanner;

public class solve_1850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        StringBuilder sb = new StringBuilder();

        long gcd = gcd(a,b);

        for(int i =0; i<gcd; i++){
            sb.append(1);
        }

        System.out.println(sb);
    }


    static long gcd(long a, long b){
        while (b!= 0 ){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
