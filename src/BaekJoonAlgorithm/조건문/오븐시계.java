package BaekJoonAlgorithm.조건문;

import java.util.Scanner;

public class 오븐시계 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();

        String[] numbers = input.split(" ");

        // 입력된 시간과 분
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        // 입력된 타이머 값
        int timer = stdIn.nextInt();

        // 입력된 타이머 값을 시간과 분으로 변환하여 더함
        a += timer / 60;
        b += timer % 60;

        // 분이 60을 넘어갈 경우 시간을 증가시키고 분을 조정함
        if (b >= 60) {
            a += b / 60;
            b %= 60;
        }

        // 시간이 24를 넘어갈 경우 24로 나눈 나머지를 사용함
        a %= 24;

        System.out.println(a + " " + b);
    }
}