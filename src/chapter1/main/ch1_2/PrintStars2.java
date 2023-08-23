package chapter1.main.ch1_2;

import java.util.Scanner;

public class PrintStars2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        do{
            System.out.print("n값 :");
            n=stdIn.nextInt();
        }while (n<=0);

        do{
            System.out.print("w값 :");
            w=stdIn.nextInt();
        }while (w<=0 || w>n);

        //("*".repeat(w) 은 w=5,  "*"을 w만큼 반복해서 호출 String 클래스에 들어 있는 인스턴스 변수이다.

        for (int i =0; i<n/w; i++)  //n=14 , w=5일때 2번 반복문
            System.out.println("*".repeat(w)); //"*****" 2번 반복

        int rest = n%w;  // n= 14, w = 5일때 rest=4가된다.
        if (rest != 0)     // 4
            System.out.println("*".repeat(rest)); //"*"이 4번반복
    }
}
