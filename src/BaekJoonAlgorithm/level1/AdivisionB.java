package BaekJoonAlgorithm.level1;

import java.util.Scanner;

/**
 *문제번호 1008
 * A, B를 입력받고 A/B 값을 출력
 */
public class AdivisionB {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double A = stdIn.nextInt();

        double B = stdIn.nextInt();

        System.out.println(A/B);

    }
}
