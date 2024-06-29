package BaekJoonAlgorithm;

import java.util.Scanner;

public class 패토리얼0의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = fact(n);

        System.out.println(count);
    }

    private static int fact(int n){
        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }

}
