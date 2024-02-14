package Do_It_Book.chapter1.exercise.ex2;

import java.util.Scanner;

public class ex2_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        System.out.print("a 의 값: ");
        int a = stdIn.nextInt();

        int b= 0;
        while (true){
            System.out.print("b의 값:");
            b = stdIn.nextInt();
            if(b>a)
                break;
            else
                System.out.println("a보다 큰 값을 입력하세요!");
        }

        int cha = b-a;
        System.out.println("b-a는 "+cha+"입니다.");
    }
}
