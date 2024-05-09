package BaekJoonAlgorithm.재귀호출;

import java.util.Scanner;

public class 팩토리얼2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long factorial = factorial(n);

        System.out.println(factorial);
    }
    static  long factorial(long n){
        if (n>1) {
            return n * factorial(n - 1);
        }else return 1;
    }
}
