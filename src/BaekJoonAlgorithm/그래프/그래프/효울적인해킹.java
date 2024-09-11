package BaekJoonAlgorithm.그래프.그래프;

import java.util.*;
import java.io.*;

public class 효울적인해킹 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] result;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new List[n+1];
        result = new int[n+1];

        for (int i =1; i<=n;i++){
            graph[i] = new ArrayList<>();
        }

        for (int i =0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph[start].add(end);
        }

        for (int i =1; i<=n;i++){
            visited = new boolean[n+1];
            dfs(i);
        }

        int max= 0;
        for (int i =0;i< result.length;i++){
            max = Math.max(max,result[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i =1; i<=n;i++){
            if (result[i] == max){
                sb.append(i+" ");
            }
        }
        System.out.println(sb);
    }

    static void dfs(int node){
        visited[node] = true;

        for (int next : graph[node]){
            if (!visited[next]){
                result[next]++;
                dfs(next);
            }
        }
    }
}
