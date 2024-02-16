package BaekJoonAlgorithm.반복문;

import java.util.Scanner;

/**
 * 문제번호 2739번
 */
public class 구구단 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        if (n>1&&n<=9) {
            for (int i = 1; i <= 9; i++)
                System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
