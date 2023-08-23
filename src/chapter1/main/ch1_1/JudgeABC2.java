package chapter1.main.ch1_1;

import java.util.Scanner;

public class JudgeABC2 {
    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int a = stdId.nextInt();
        System.out.println(abc(a));
    }

    private static int abc(int a){


        if(a ==1)
            System.out.println("A");
        else if (a == 2)
            System.out.println("B");
        else if(a==3)
            System.out.println("C");
        return a;
    }
}
