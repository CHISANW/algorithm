package Do_It_Book.chapter1.exercise.ex2;

import java.util.Scanner;

public class ex2_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수를 입력해 주세요!");

        int n;
        do{
            System.out.print("정수 값: ");
            n = stdIn.nextInt();
        }while (n<=0);

        int no = 0;
        while (n>0){
            n /= 10;
            no++;
        }

        System.out.println("입련한 수 의 자릿수는"+no+"입니다.");

    }
}
