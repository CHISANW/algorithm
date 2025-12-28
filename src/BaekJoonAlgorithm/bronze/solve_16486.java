package BaekJoonAlgorithm.bronze;

import java.util.Scanner;

public class solve_16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.close();

        double pi = 3.141592;
        double result = 2.0 * d1 + 2.0* d2 * pi;
        System.out.println(result);

    }
}
