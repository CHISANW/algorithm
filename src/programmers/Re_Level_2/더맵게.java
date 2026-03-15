package programmers.Re_Level_2;

import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12},7));
    }

    static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1 - o2);
        for (int i : scoville) {
            pq.offer(i);
        }
        int answer = 0;

        while (pq.size() >= 2 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();

            pq.offer(first + second * 2);
            answer++;
        }

        if (pq.peek() >= K) {
            return answer;
        }

        return -1;
    }
}
