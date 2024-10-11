package BaekJoonAlgorithm.분할정복;

import java.util.Scanner;

public class Moo게임 {
    static int n;
    static char answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        moo(n);
        System.out.println(answer);
    }

    static void moo(int n) {
        int size = 3;
        int index = 0;
        if (n == 1) {
            answer = 'm';
        } else if (n <= size) {
            answer = 'o';
        } else {
            while (size < n) {
                size = size * 2 + index + 4;
                index++;
            }

            int first = (size - index - 3) / 2;
            if (size - first + 1 <= n){
                moo(n - size + first);
            }
            else if (first+1 == n){
                answer = 'm';
            }
            else
                answer = 'o';
        }
    }
}
