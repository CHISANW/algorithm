package programmers.Level_1;

import java.util.*;

public class 명예의전당 {
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;
        System.out.println(Arrays.toString(solution(k, score)));  // [10, 10, 10, 20, 20, 100, 100]
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>(k);

        for (int i = 0; i < score.length; i++) {
            if (hallOfFame.size() < k) {
                hallOfFame.offer(score[i]);
            } else if (score[i] > hallOfFame.peek()) {
                hallOfFame.poll();
                hallOfFame.offer(score[i]);
            }
            answer[i] = hallOfFame.peek();
        }

        return answer;
    }
}
