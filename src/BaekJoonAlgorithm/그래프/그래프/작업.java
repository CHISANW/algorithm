package BaekJoonAlgorithm.그래프.그래프;

import java.io.*;
import java.util.*;

public class 작업 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph[end].add(start);
        }

        int target = Integer.parseInt(br.readLine());
        int answer = bfs(n, target);

        System.out.println(answer);
    }

    static int bfs(int n, int start) {
        visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int result = 0;
        while (!q.isEmpty()){
            Integer now = q.poll();
            for (Integer next : graph[now]){
                if (!visited[next]){
                    q.add(next);
                    visited[next] = true;
                    result++;
                }
            }
        }
        return result;
    }
}
