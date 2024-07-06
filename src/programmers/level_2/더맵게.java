package programmers.level_2;

import java.util.*;

public class 더맵게 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scoville,k));       //result -> 2
    }

    public static int solution(int[] scoville, int K){
        int mixCount =0;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int s : scoville){
            q.offer(s);
        }


        while (q.size()> 1 && q.peek() <K){
            Integer first = q.poll();
            Integer second = q.poll();

            int mix = first + (second * 2);
            q.offer(mix);
            mixCount++;
        }

        if(q.peek() <K){
            return -1;
        }
        return mixCount;
    }
}
