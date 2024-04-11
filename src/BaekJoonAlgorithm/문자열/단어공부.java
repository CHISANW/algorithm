package BaekJoonAlgorithm.문자열;

import java.util.Scanner;

/**
 * 문제번호 1157번
 */
public class 단어공부 {
    public static int[] getAlpha(String str){
        int[] count =new int[26];

        for (int i=0;i<str.length();i++){
            count[str.charAt(i)-'A']++;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.next().toUpperCase();

        int[] count = getAlpha(str);

        int max = -1;
        char alphaValue = '?';
        for (int i =0;i<count.length;i++){
            if (max<count[i]){
                max = count[i];
                alphaValue = (char)(i+'A');
            }else if (count[i]==max){
                alphaValue = '?';
            }
        }

        System.out.println(alphaValue);
    }
}
