package BaekJoonAlgorithm.조건문;

import java.util.Scanner;

/**
 * 14681번
 */
public class 사분면고르기 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        if (a>0){
            if (b>0){
                System.out.println(1);
            }else
                System.out.println(4);
        }

        if (a<0){
            if (b>0)
                System.out.println(2);
            else
                System.out.println(3);
        }

    }
}
