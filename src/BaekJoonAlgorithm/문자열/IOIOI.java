package BaekJoonAlgorithm.문자열;

import java.util.*;

public class IOIOI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        String m = sc.next();

        int count = 0;
        int patternCount = 0;

        for (int i = 1; i < s - 1; i++) {
            if (m.charAt(i - 1) == 'I' && m.charAt(i) == 'O' && m.charAt(i + 1) == 'I') {
                patternCount++;
                if (patternCount == n) {
                    count++;
                    patternCount--;
                }
                i++;
            } else {
                patternCount = 0;
            }
        }

        System.out.println(count);
    }
}