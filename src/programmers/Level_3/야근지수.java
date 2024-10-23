package programmers.Level_3;

import java.util.PriorityQueue;

public class 야근지수 {
    public static void main(String[] args) {
        int[] works = {4, 3, 3};
        System.out.println(solution(4, works));

        int[] works1 = {2, 1, 2};
        System.out.println(solution(1, works1));

        int[] works2 = {1, 1};
        System.out.println(solution(3, works2));
    }

    public static long solution(int n, int[] works) {

        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int work : works) {
            q.add(work);
        }

        while (!q.isEmpty()){
            if (n == 0){
                break;
            }

            Integer now = q.poll();
            int value = now - 1;
            n--;
            if (value>0){
                q.add(value);
            }
        }

        long result = 0;

        while (!q.isEmpty()){
            Integer now = q.poll();
            result += (long)now*now;
        }
        return result;
    }
}
