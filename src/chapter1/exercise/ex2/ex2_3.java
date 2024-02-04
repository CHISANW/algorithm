package chapter1.exercise.ex2;

import java.util.Scanner;

public class ex2_3 {
    static int sumOf(int a, int b) {
        int sum = 0;
        if(a<b) {
            for (int i = a; i <= b; i++)
                sum += i;
        }
        else if(a>b){
            for(int i =b; i<=a;i++)
                sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("두수를 입력해주세요");
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        
        System.out.println(a+"부터"+b+"까지의 합은 "+sumOf(a,b)+"입니다.");
    }
}
