package BaekJoonAlgorithm.그래프.DFS;

import java.io.*;
import java.util.*;

public class BaekJoon_24483 {
    static List<Integer>[] graph;
    static int n, m;
    static boolean[] visited;
    static int[] order;
    static int[] depth;
    static int visitOrder = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        graph = new List[n + 1];
        visited = new boolean[n + 1];
        depth = new int[n + 1];
        order = new int[n + 1];
        Arrays.fill(depth, -1);

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph[start].add(end);
            graph[end].add(start);
        }

        for (int i = 1; i <= n; i++) {
            graph[i].sort(Integer::compareTo);
        }


        dfs(r, 0);

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) depth[i] * order[i];
        }
        System.out.println(sum);
    }

    static void dfs(int start, int d) {
        visited[start] = true;
        depth[start] = d;
        order[start] = visitOrder++;
        for (Integer next : graph[start]) {
            if (!visited[next]) {
                dfs(next, d + 1);
            }
        }
    }
}
