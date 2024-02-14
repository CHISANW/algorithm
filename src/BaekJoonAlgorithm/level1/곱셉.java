package BaekJoonAlgorithm.level1;

import java.util.Scanner;


/**
 * 문제번호 2588번
 */
public class 곱셉 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        String a = stdIn.nextLine();
        String b = stdIn.nextLine();

        int inta = Integer.parseInt(a); //형변환
        int intb = Integer.parseInt(b); //형변환

        char length0 = b.charAt(0);
        char length1 = b.charAt(1);
        char length2 = b.charAt(2);

        int value0 = Character.getNumericValue(length0);
        int value1 = Character.getNumericValue(length1);
        int value2 = Character.getNumericValue(length2);

        System.out.println(inta*value2);
        System.out.println(inta*value1);
        System.out.println(inta*value0);

        System.out.println(intb*inta);

    }
}
