package BaekJoonAlgorithm.반복문;


import java.util.Scanner;

/**
 * 문제번호 2438번
 */
public class 별찍기 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        for (int i = N; i>=1; i++) {
            System.out.println("*");
        }
    }
}

