package BaekJoonAlgorithm.브루트포스;

import java.util.Scanner;

public class 금민수의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long start = sc.nextLong();
        long end = sc.nextLong();

        int count = 0;
        for (long i = start; i <= end; i++) {
            long temp = i;
            boolean check = true;
            while (temp > 0) {
                long value = temp % 10;
                if (value != 4 && value != 7) {
                    check = false;
                    break;
                }
                temp /= 10;
            }
            if (check) count++;
        }

        System.out.println(count);
    }
}
