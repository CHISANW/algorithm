package BaekJoonAlgorithm.다이크스트라;

import java.util.*;

public class 특정한최단경로 {
    static int INF = 10000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        if(e==0){
            System.out.println(-1);
            return;
        }

        List<Node>[] graph =  new ArrayList[n + 1];
        int[] costs = new int[n + 1];
        for(int i = 1;i<=n;i++){
            graph[i] = new ArrayList<>();
            costs[i] = INF;
        }

        for(int i =0;i<e;i++){
            int start = sc.nextInt(), end = sc.nextInt(), cost = sc.nextInt();
            graph[start].add(new Node(end, cost));
            graph[end].add(new Node(start,cost));
        }

        int v1 = sc.nextInt() , v2 = sc.nextInt();
        int answer1 = dijkstra(graph, 1, v1) + dijkstra(graph, v1, v2) + dijkstra(graph, v2, n);
        int answer2 = dijkstra(graph, 1, v2) + dijkstra(graph, v2, v1) + dijkstra(graph, v1, n);

        int answer = Math.min(answer1, answer2);
        if(answer >= INF) System.out.println(-1);
        else System.out.println(answer);
    }

    static int dijkstra (List<Node>[] graph , int start, int end){
        int[] cost = new int[graph.length];

        PriorityQueue<Node> q = new PriorityQueue<>((o1, o2) -> {
            return o1.cost - o2.cost;
        });
        for(int i =1; i<cost.length;i++){
            cost[i] = INF;
        }
        cost[start] = 0;
        q.add(new Node(start,0));

        while (!q.isEmpty()){
            Node now = q.poll();

            if(now.cost > cost[now.dist]) continue;
            for(Node next : graph[now.dist]){
                if(cost[next.dist] > cost[now.dist] + next.cost){
                    cost[next.dist] = cost[now.dist] + next.cost;
                    q.offer(new Node(next.dist,cost[next.dist]));
                }
            }
        }
        return cost[end];
    }
}

class Node{
    int dist, cost;

    public Node(int disc, int cost){
        this.dist = disc;
        this.cost = cost;
    }
}
