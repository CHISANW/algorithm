package BaekJoonAlgorithm.백트래킹;

import java.util.Scanner;

public class BaekJoon_19949 {
    static int[] answer;
    static int[] choices;
    static int count = 0;
    static int question = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        answer = new int[question];
        choices = new int[question];

        for (int i = 0; i < question; i++) {
            answer[i] = sc.nextInt();
        }

        backTracking(0, 0);

        System.out.println(count);
    }

    static void backTracking(int depth, int score) {
        if (depth == question) {
            if (score >= 5) {
                count++;
            }
            return;
        }

        for (int i = 1; i <= 5; i++) {
            if (depth >= 2 && choices[depth - 1] == i && choices[depth - 2] == i) {
                continue;
            }

            choices[depth] = i;
            int newScore = score + (i == answer[depth] ? 1 : 0);
            backTracking(depth + 1, newScore);
        }
    }
}
