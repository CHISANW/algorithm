package BaekJoonAlgorithm.문자열;

import java.util.*;

public class 한국이그리울땐서버에접속하지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String pattern = sc.next();

        String[] split = pattern.split("\\*");
        String start = split[0];
        String end = split.length > 1 ? split[1] : "";

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            boolean startsWith = line.startsWith(start);
            boolean endsWith = line.endsWith(end);
            boolean isValidLength = line.length() >= start.length() + end.length();

            if (startsWith && endsWith && isValidLength) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
