package BaekJoonAlgorithm.스택큐덱.큐;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 문제번호  11286번
 * 우선순위 큐를 이용한 알고리즘 풀이 Math.abs 를 이용해 절대값 정렬을 해야한다.
 */
public class 절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if (first_abs == second_abs){
                return o1 > o2 ? 1:-1;
            }
            return first_abs- second_abs;
        });
        for (int i =0;i<n;i++){
            int a = Integer.parseInt(br.readLine());
            if (a==0){
                if (priorityQueue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(priorityQueue.poll());
            }else
                priorityQueue.add(a);
        }
    }
}
