package BaekJoonAlgorithm.그리디;

import java.util.*;

public class 롤케이크 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator
                .comparingInt((Integer num) -> num % 10)
                .thenComparingInt(num -> num));

        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num==10){
                count++;
                continue;
            }
            if (num<10) continue;
            q.add(num);
        }

        while (!q.isEmpty() && m > 0) {
            Integer poll = q.poll();

            if (poll - 10 == 10) {  // 혹시 값이 20이면 10 짜리 케잌이 2개 생긴다.
                count++;
            }

            if (poll - 10 > 10) {
                q.add(poll - 10);
            }

            count++;
            m--;
        }
        System.out.println(count);
    }
}
