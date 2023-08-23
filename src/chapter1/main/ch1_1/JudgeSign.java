package chapter1.main.ch1_1;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int a = stdIn.nextInt();

        if (a>0)
            System.out.println("이 수는 양수 입니다.");
        if(a<0)
            System.out.println("이 수는 음수 입니다.");
        if(a==0)
            System.out.println("이 수는 0입니다.");

    }
}
