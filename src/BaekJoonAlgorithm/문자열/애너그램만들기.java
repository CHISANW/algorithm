package BaekJoonAlgorithm.문자열;

import java.util.Scanner;

/**
 * 문제번호 1919번
 */
public class 애너그램만들기 {
    public static int[] getAlphaBet(String str){
        int[] count = new int[26];

        for (int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String a = stdIn.next();
        String b = stdIn.next();

        int[] countA = getAlphaBet(a);
        int[] countB = getAlphaBet(b);

        int count = 0;
        for (int i =0;i<26;i++)
            count += Math.abs(countA[i] - countB[i]);

        System.out.println(count);
    }
}


