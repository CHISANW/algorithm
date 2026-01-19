package programmers.level_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class solve_24481 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] depth;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        depth = new int[n + 1];

        Arrays.fill(depth, -1);

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        // 문제 조건: 정점 번호 오름차순 탐색
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(r, 0);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(depth[i]).append('\n');
        }
        System.out.print(sb);
    }

    static void dfs(int cur, int d) {
        visited[cur] = true;
        depth[cur] = d;

        for (int next : graph[cur]) {
            if (!visited[next]) {
                dfs(next, d + 1);
            }
        }
    }
}
