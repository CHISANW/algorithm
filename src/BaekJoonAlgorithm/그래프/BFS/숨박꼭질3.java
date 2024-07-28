package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 숨박꼭질3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] time = new int[100001];
        Arrays.fill(time, Integer.MAX_VALUE);

        pq.add(new Node(N, 0));
        time[N] = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (current.position == K) {
                System.out.println(current.time);
                return;
            }

            if (current.position * 2 <= 100000 && current.time < time[current.position * 2]) {
                time[current.position * 2] = current.time;
                pq.add(new Node(current.position * 2, current.time));
            }

            if (current.position + 1 <= 100000 && current.time + 1 < time[current.position + 1]) {
                time[current.position + 1] = current.time + 1;
                pq.add(new Node(current.position + 1, current.time + 1));
            }

            if (current.position - 1 >= 0 && current.time + 1 < time[current.position - 1]) {
                time[current.position - 1] = current.time + 1;
                pq.add(new Node(current.position - 1, current.time + 1));
            }
        }
    }
}

class Node implements Comparable<Node> {
    int position;
    int time;

    public Node(int position, int time) {
        this.position = position;
        this.time = time;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.time, other.time);
    }
}
