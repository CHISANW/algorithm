package BaekJoonAlgorithm.조건문;

import java.util.Scanner;

/**
 * 문제번호 9498번
 */
public class 시험성적 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();

        if (num>=90 && num<=100) {
            System.out.println("A");
        }else if (num>=80) {
            System.out.println("B");
        }else if (num>=70) {
            System.out.println("C");
        }else if (num>=60) {
            System.out.println("D");
        }else
            System.out.println("F");
    }
}
