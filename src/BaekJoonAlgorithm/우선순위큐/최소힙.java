package BaekJoonAlgorithm.우선순위큐;

import java.util.*;

public class 최소힙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1- o2);

        for(int i=0; i<N;i++){
            int x = sc.nextInt();

            if(x == 0){
                Integer poll = pq.poll();
                if(poll == null){
                    sb.append(0+"\n");
                }else sb.append(poll+"\n");
            }else {
                pq.add(x);
            }
        }
        System.out.println(sb);
    }
}
