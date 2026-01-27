package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class solve_24482 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] depth;
    static int n,m,r;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        depth = new int[n+1];
        for(int i =1; i<=n;i++){
            graph[i] = new ArrayList<>();
            depth[i] = -1;
        }
        for(int i = 0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i =1 ;i<=n;i++){
            graph[i].sort((a,b) -> b- a);
        }

        visited[r] = true;
        depth[r] = 0;
        dfs(r);
        StringBuilder sb = new StringBuilder();
       for(int i =1;i<=n;i++){
           sb.append(depth[i]).append("\n");
       }
        System.out.println(sb);
    }

    static void dfs(int cur){

        for(int next : graph[cur]){
            if(visited[next]) continue;
            visited[next] = true;
            depth[next] = depth[cur] + 1;
            dfs(next);
        }

    }
}
