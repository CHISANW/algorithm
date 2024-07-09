package programmers.level_2;

import java.util.*;

public class 호텔대실 {
    public static void main(String[] args) {
        String[][] book_time ={{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
        System.out.println(solution(book_time));    //result -> 3

        String[][] book_time1 ={{"09:10", "10:10"}, {"10:20", "12:20"}};
        System.out.println(solution(book_time1));   //result -> 1

        String[][] book_time2 ={{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}};
        System.out.println(solution(book_time2));   //result -> 3
    }

    static int solution(String[][] book_time) {
        int answer = 0;

        Arrays.sort(book_time, (x, y) -> x[0].compareTo(y[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[1] - y[1]);

        for (String[] time : book_time) {
            String[] starts = time[0].split(":");
            String[] ends = time[1].split(":");

            int start = Integer.parseInt(starts[0]) * 60 + Integer.parseInt(starts[1]);
            int end = Integer.parseInt(ends[0]) * 60 + Integer.parseInt(ends[1]) + 10;

            if (pq.isEmpty()) {
                answer++;
                pq.offer(new int[]{start, end});
                continue;
            }

            int[] prev = pq.poll();
            int endPrev = prev[1];

            if (start >= endPrev) {
                pq.offer(new int[]{start, end});
            } else {
                answer++;
                pq.offer(new int[]{start, end});
                pq.offer(prev);
            }
        }
        return answer;
    }

}
