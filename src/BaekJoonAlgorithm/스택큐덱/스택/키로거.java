package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 키로거 {
    public static void main(String[] args) throws Exception{
        Scanner std = new Scanner(System.in);
        int T = std.nextInt();
        while (T-- > 0) {
            char[] input = std.next().toCharArray();
            Deque<Character> beforCursor = new LinkedList<>();
            Deque<Character> afterCursor = new LinkedList<>();
            for (char cmd : input) {
                if (cmd == '-') {
                    beforCursor.pollLast();
                }
                else if (cmd == '<') {
                    if (!beforCursor.isEmpty())
                        afterCursor.offerLast(beforCursor.pollLast());
                }
                else if (cmd == '>') {
                    if (!afterCursor.isEmpty())
                        beforCursor.offerLast(afterCursor.pollLast());
                }
                else {
                    beforCursor.offerLast(cmd);
                }
            }

            StringBuilder sb = new StringBuilder();
            while (!beforCursor.isEmpty()) sb.append(beforCursor.pollFirst());
            while (!afterCursor.isEmpty()) sb.append(afterCursor.pollLast());
            System.out.println(sb);
        }
    }
}
