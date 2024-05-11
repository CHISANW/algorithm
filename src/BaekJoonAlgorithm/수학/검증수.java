package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 검증수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i =0;i<5;i++){
            int a = sc.nextInt();
            sum += a*a;
        }

        System.out.println(sum%10);
    }
}
