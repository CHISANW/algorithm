package Do_It_Book.chapter1.exercise.ex2;

import java.util.Scanner;

public class ex2_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n 까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n =stdIn.nextInt();

        int sum = 0;
        int i =1;

        while (i <= n){
            sum+=i;
            i++;
        }
        System.out.println(i);
        System.out.println("1부터 "+n+"까지의 합은"+sum+"입니다.");
    }
}
