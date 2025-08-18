package BaekJoonAlgorithm.랜덤_마라톤.Solve_63;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem_7489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            BigInteger factorial = factorial(a);
            String value = factorial.toString();
            for (int i = value.length() - 1; i >= 0; i--) {
                if (value.charAt(i) != '0') {
                    System.out.println(value.charAt(i));
                    break;
                }
            }
        }
    }


    public static BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

}
