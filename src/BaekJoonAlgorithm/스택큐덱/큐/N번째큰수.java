package BaekJoonAlgorithm.스택큐덱.큐;

import java.util.*;

public class N번째큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>((o1,o2) -> o2-o1);

        for (int i =0;i<n*n;i++){
            q.add(sc.nextInt());
        }

        for (int i = 0;i<n-1;i++){
            q.poll();
        }

        System.out.println(q.poll());
    }
}
