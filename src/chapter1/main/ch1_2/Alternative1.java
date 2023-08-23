package chapter1.main.ch1_2;

import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 출력합니다.");

        do {
            System.out.print("n의 값: ");
            n=stdIn.nextInt();
        }while (n<=0);

        for(int i=0;i<n;i++){
            if(i%2==0)
                System.out.print("+");
            else if (i%2==1)
                System.out.print("-");
        }
    }
}
