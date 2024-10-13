package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 타일위의대각선 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + y - gcd(x,y));
    }

    static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}