package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 더하기_사이클 {

    public static int getNextNumber(int x) {
        int rightDigit = (x / 10 + (x % 10)) % 10;
        int leftDigit = x % 10;
        return leftDigit * 10 + rightDigit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cur = N;
        int len = 0;
        do {
            cur = getNextNumber(cur);
            len++;
        } while(cur != N);
        System.out.println(len);
        }
}
