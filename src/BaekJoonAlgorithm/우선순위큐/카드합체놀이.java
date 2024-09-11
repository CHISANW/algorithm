package BaekJoonAlgorithm.우선순위큐;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 카드합체놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i =0; i<n;i++){
            pq.add(sc.nextLong());
        }

        for (int i =0; i<m;i++){
            Long x = pq.poll();
            Long y = pq.poll();
            Long value = x+y;
            pq.add(value);
            pq.add(value);
        }

        long sum =0;
        while (!pq.isEmpty()){
            sum+=pq.poll();
        }

        System.out.println(sum);
    }
}
