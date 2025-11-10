package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(lcm(a,b));

    }

    static long gcd(long a, long b){
        while (b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return  a;
    }

    static long lcm(long a, long b){
        return a * b / gcd(a,b);
    }
}
