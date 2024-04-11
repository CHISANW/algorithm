package BaekJoonAlgorithm.문자열;

import java.util.Scanner;

/**
 * 문제번호 2744번
 */
public class 대소문자_바꾸기 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.next();
        String arr = "";

        for (int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if ('A'<=c &&c<='Z'){
                arr += (char)('a' + c- 'A');
            }else
                arr+= (char)('A' + c - 'a');
        }

        System.out.println(arr);
    }
}
