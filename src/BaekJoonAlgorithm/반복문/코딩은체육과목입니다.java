package BaekJoonAlgorithm.반복문;

import java.util.Scanner;

/**
 * 문제번호 25314번
 */
public class 코딩은체육과목입니다 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int result = 0;

        if (a>4){
            result = a/4;
        }else
            System.out.print("long ");

        for (int i=0;i<result;i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
