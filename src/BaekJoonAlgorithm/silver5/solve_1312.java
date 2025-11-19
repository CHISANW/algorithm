package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int n = sc.nextInt();

        long rem = a%b;

        for(int i =0; i<n;i++){
            rem *= 10;
            long digit = rem / b;
            rem = rem % b;

            if( i==n-1){
                System.out.println(digit);
            }
        }

    }
}
