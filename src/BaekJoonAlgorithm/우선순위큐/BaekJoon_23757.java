package BaekJoonAlgorithm.우선순위큐;

import java.util.*;

public class BaekJoon_23757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        boolean possible = true;
        for (int i = 0; i < m; i++) {
            int request = sc.nextInt();
            if (q.isEmpty() || q.peek() < request) {
                possible = false;
                break;
            }
            q.add(q.poll() - request);
        }

        System.out.println(possible ? 1 : 0);
    }
}
