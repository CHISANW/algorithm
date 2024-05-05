package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.*;


public class 외계인의기타연주 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int P = stdIn.nextInt();

        Deque<Integer>[] stack = new ArrayDeque[7];

        for (int i =1 ;i<=6;i++){
            stack[i] = new ArrayDeque<>();
        }

        int moveCount = 0;
        for (int i =0;i<N;i++){
            int melody = stdIn.nextInt();
            int fret = stdIn.nextInt();

            while (!stack[melody].isEmpty()) {
                if (stack[melody].peekLast() > fret) {
                    moveCount++;
                    stack[melody].pollLast();
                } else
                    break;

            }
                if (!stack[melody].isEmpty() && stack[melody].peekLast() ==fret)
                    continue;
                stack[melody].addLast(fret);
                moveCount++;
            }
        System.out.println(moveCount);

    }
}
