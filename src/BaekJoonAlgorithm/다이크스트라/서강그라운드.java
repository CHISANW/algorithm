package BaekJoonAlgorithm.다이크스트라;

import java.util.*;

public class 서강그라운드 {
    static int INF = 10000000;
    static List<Node>[] graph;
    static int[] weapon;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int r = sc.nextInt();

        weapon = new int[n + 1];
        graph = new List[n + 1];


        for (int i = 1; i <= n; i++) {
            weapon[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < r; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            graph[start].add(new Node(end, cost));
            graph[end].add(new Node(start, cost));
        }

        int max = 0;

        for (int i = 1; i <= n; i++) {
            int[] cost = dijkstra(i);
            int ans = 0;
            for (int j = 1; j <= n; j++) {
                if (cost[j] <= m) {
                    ans += weapon[j];
                }
            }
            max = Math.max(ans, max);
        }
        System.out.println(max);

    }

    static int[] dijkstra(int start) {
        int[] cost = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Arrays.fill(cost, INF);

        PriorityQueue<Node> q = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);

        q.add(new Node(start, 0));
        cost[start] = 0;

        while (!q.isEmpty()) {
            Node now = q.poll();
            int end = now.end;

            if (visited[end]) continue;
            visited[end] = true;

            for (Node next : graph[end]) {
                if (cost[next.end] > next.cost + cost[end]) {
                    cost[next.end] = next.cost + cost[end];
                    q.add(new Node(next.end, cost[next.end]));
                }
            }
        }
        return cost;
    }

    static class Node {
        int end, cost;

        public Node(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
    }
}
