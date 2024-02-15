package BaekJoonAlgorithm.조건문;

import java.util.Scanner;

/**
 * 문제번호 2753번
 */
public class 윤년 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();

        if (num % 4 == 0 && (num % 100 != 0 || num%400==0)){
            System.out.println(1);
        }else
            System.out.println(0);
    }
}
