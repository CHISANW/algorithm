package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 분수합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int top = a * d + c * b;
        int bottom = b *d;

        int gcd = gcd(top,bottom);

        top /= gcd;
        bottom /= gcd;

        System.out.println(top+" "+bottom);
    }

    static int gcd(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
