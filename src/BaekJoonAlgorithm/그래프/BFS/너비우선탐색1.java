package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 너비우선탐색1 {
    static int n , m, r;
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] rank = new int[100001];
    static int rankCount = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 1;i<=n;i++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }


        for (int i =1 ; i<=n;i++){
            Collections.sort(graph[i]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(r);
        rank[r] = 1;
        visited[r] = true;

        while (!q.isEmpty()){
            Integer now = q.poll();

            for (int next : graph[now]){
                if (!visited[next]){
                    visited[next] = true;
                    rank[next]= rankCount;
                    rankCount++;
                    q.add(next);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =1; i<=n;i++){
            if (rank[i] == 0){
                sb.append(0+"\n");
                continue;
            }
            sb.append(rank[i] +"\n");
        }
        System.out.println(sb);


    }
}
