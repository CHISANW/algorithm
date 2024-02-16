package BaekJoonAlgorithm.반복문;

import java.util.Scanner;

/**
 * 문제번호 10950
 * A+B -3
 * 두 정수 A와 B를 입력받은다음 A+B를 출력하는 프로그램을 작성
 */
public class AplusBminus3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s1 = stdIn.nextLine();

        int T = Integer.parseInt(s1);
        int[] result = new int[T];

        for (int i =0;i<T;i++){
            String s = stdIn.nextLine();
            String[] numbers = s.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            result[i] =a+b;
        }
        for (int i=0;i<T; i++){
            System.out.println(result[i]);
        }
    }
}
