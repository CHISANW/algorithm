package Do_It_Book.chapter5;

import java.util.Scanner;

public class EuclidGCD {
    static int gdc(int x, int y){
        if(y==0)
            return x;
        else
            return gdc(y ,x%y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대 공약수를 구합니다.");
        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();

        System.out.print("정수를 입력하세요: ");
        int y = stdIn.nextInt();

        System.out.println("최대 공약수는 "+gdc(x,y)+"입니다.");
    }
}
