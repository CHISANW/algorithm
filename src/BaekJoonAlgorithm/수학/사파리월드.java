package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 사파리월드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        long result = Math.abs(a-b);
        System.out.println(result);
    }
}
