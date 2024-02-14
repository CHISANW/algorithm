package Do_It_Book.chapter5;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if (n>0)
            return n*factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = stdIn.nextInt();
        int factorial = factorial(num);
        System.out.println(num+"의 팩토리얼은 "+factorial+"입니다.");
    }
}
