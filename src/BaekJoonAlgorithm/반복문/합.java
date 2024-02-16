package BaekJoonAlgorithm.반복문;

import java.util.Scanner;

/**
 * 문제번호 8393번
 * n이 주어젔을때 1부터 n까지 합을 구하는 프로그램을
 */
public class 합 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int result = 0;

        for(int i = 1; i<=n; i++){
            result+=i;
        }
        System.out.println(result);
    }
}
