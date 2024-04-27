package BaekJoonAlgorithm.테스트;

import java.util.Scanner;

public class 사와칠 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int K = stdIn.nextInt();

        String ans = Integer.toBinaryString(K + 1).replace('0', '4').replace('1', '7');
        System.out.println(ans.substring(1));
    }
}
