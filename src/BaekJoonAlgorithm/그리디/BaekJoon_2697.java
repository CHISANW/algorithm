package BaekJoonAlgorithm.그리디;

import java.util.*;

public class BaekJoon_2697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String number = sc.nextLine();
            System.out.println(findNextNumber(number));
        }
    }

    public static String findNextNumber(String number) {
        char[] digits = number.toCharArray();
        int n = digits.length;

        int i = n - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i == -1) {
            return "BIGGEST";
        }

        int j = n - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        swap(digits, i, j);

        reverse(digits, i + 1, n - 1);

        return new String(digits);
    }

    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    private static void reverse(char[] digits, int start, int end) {
        while (start < end) {
            swap(digits, start++, end--);
        }
    }
}
