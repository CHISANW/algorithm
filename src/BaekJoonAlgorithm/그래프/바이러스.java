package BaekJoonAlgorithm.그래프;

import java.util.*;

public class 바이러스 {
    static int n,m;
    static int[][] graph;
    static boolean[] visited;
    static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //정점
        m = sc.nextInt(); //간선
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i =0;i<m;i++){
            int src = sc.nextInt();
            int dist = sc.nextInt();
            graph[src][dist] = 1;
            graph[dist][src] = 1;
        }

        dfs(1);
        System.out.println(count-1);        //result = 4

//        bfs(1);
//        System.out.println(count-1);;        //result = 4
    }

    
    //깊이 우선 탐색
    static void dfs(int node){
        visited[node] =true;
        count++;

        for(int i =1;i<=n;i++){
            if(graph[node][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }

    //큐를 사용한 넓이 우선 탐색
    static Queue<Integer> q;
    static void bfs(int node){
        q = new LinkedList<>();
        q.add(node);
        visited[node]= true;

        while(!q.isEmpty()){
            int now = q.poll();
            count++;
            for(int i =1;i<=n;i++) {
                if (graph[now][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
