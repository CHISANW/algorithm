package BaekJoonAlgorithm.문자열;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제번호 1543번
 */
public class 문서검색 {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);

        String doc = stdIn.nextLine();
        String word = stdIn.nextLine();

        int startIndex = 0;
        int count = 0;
        while (true){
            int findIndex = doc.indexOf(word, startIndex);
            System.out.println("인덱스 값= "+findIndex);

            if (findIndex<0) {
                break;
            }
            startIndex = findIndex + word.length();
            count++;
        }

        System.out.println(count);
    }
}
