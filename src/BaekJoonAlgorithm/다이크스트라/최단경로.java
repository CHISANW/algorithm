package BaekJoonAlgorithm.다이크스트라;

import java.util.*;

public class 최단경로 {
    static int v, e,k;
    static int INF = 10000000;
    static List<Node>[] graph;
    static int[] cost;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt(); // 정점
        e = sc.nextInt(); // 간선
        k = sc.nextInt(); // 시작 정점

        cost = new int[v+1];
        graph = new ArrayList[v + 1];
        for (int i =1 ; i <=v;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i =0;i<e;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            graph[start].add(new Node(end, cost));
        }

        Arrays.fill(cost,INF);
        dijkstra(k);

        for(int i =1; i<=v;i++){
            if (cost[i]>=INF) System.out.println("INF");
            else System.out.println(cost[i]);
        }
    }

    static void dijkstra(int start){
        boolean[] visited = new boolean[v+1];

        PriorityQueue<Node> q = new PriorityQueue<>((o1,o2) ->{
            return o1.cost - o2.cost;
        });
        q.add(new Node(start,0));
        cost[start] = 0;

        while (!q.isEmpty()){
            Node now = q.poll();
            int end = now.end;

            if(visited[end]) continue;
            visited[end] =true;

            for(Node next : graph[end]){
                if(cost[next.end] > cost[end]+ next.cost){
                    cost[next.end] = cost[end]  + next.cost;
                    q.add(new Node(next.end, cost[next.end]));
                }
            }
        }
    }
    static class Node{
        int end, cost;

        public Node(int end, int cost){
            this.end = end;
            this.cost = cost;
        }
    }
}
