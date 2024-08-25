package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 깊이우선탐색2 {
    static int n,m,r;
    static List<Integer>[] graph;
    static boolean[] check;
    static int[] rank = new int[100001];
    static int rankCount = 2;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();

        graph = new ArrayList[n+1];
        check = new boolean[n+1];

        for(int i = 1; i<=n;i++){
            graph[i] = new ArrayList<>();
        }

        for (int i =0; i<m;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph[start].add(end);
            graph[end].add(start);
        }

        for (int i =1; i<=n; i++){
            Collections.sort(graph[i],(o1, o2) -> o2-o1);
        }
        rank[r] = 1;
        check[r] = true;

        dfs(r);
        StringBuilder sb = new StringBuilder();
        for (int i =1; i<=n;i++){
            if (rank[i]==0){
                sb.append(0+"\n");
                continue;
            }
            sb.append(rank[i]+"\n");
        }

        System.out.println(sb);

    }

    static void dfs(int node){
        for (Integer next : graph[node]){
            if (!check[next]){
                check[next] = true;
                rank[next] = rankCount;
                rankCount++;
                dfs(next);

            }
        }
    }
}
