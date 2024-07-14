package programmers.level_2;

import java.util.*;

public class 두큐합같게만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 2, 7, 2}, new int[] {4, 6, 5, 1})); //result -> 2
        System.out.println(solution(new int[]{1, 2, 1, 2}, new int[] {1, 10, 1, 2}));   // result -> 7
        System.out.println(solution(new int[]{1, 1}, new int[] {1, 5}));    // result -> -1
    }

    public static int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;

        for(int i : queue1){
            sum1 += (long)i;
            q1.add(i);
        }
        for(int i : queue2){
            sum2 += (long)i;
            q2.add(i);
        }

        while(sum1 != sum2){
            if(answer > (queue1.length + queue2.length)*2)
                return -1;

            int val = 0;
            if(sum1 < sum2){
                val = q2.poll();
                q1.add(val);
                sum1 += (long)val;
                sum2 -= (long)val;
            }else if(sum1 > sum2){
                val = q1.poll();
                q2.add(val);
                sum2 += (long)val;
                sum1 -= (long)val;
            }else{
                return answer++;
            }
            answer++;
        }

        return answer;
    }
}
