package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 팰린드룸수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (line.equals("0")) break; // 입력이 "0"일 경우 종료

            StringBuilder sb = new StringBuilder(line);
            String reverse = sb.reverse().toString();

            if (line.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
