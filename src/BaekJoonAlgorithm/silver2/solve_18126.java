package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class solve_18126 {
    static List<Point>[] graph;
    static boolean[] visited;
    static long maxDist = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());



        graph = new ArrayList[n + 1];
        visited = new boolean[n+1];

        for(int i =1; i<=n;i++){
            graph[i] = new ArrayList<>();
        }


        for (int i =0; i<n-1;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            graph[a].add(new Point(b, value));
            graph[b].add(new Point(a, value));
        }

        dfs(1,0);
        System.out.println(maxDist);
    }

    static void dfs(int node, long dist){
        visited[node] = true;

        maxDist = Math.max(maxDist, dist);

        for(Point next : graph[node]){
            if(!visited[next.next]){
                dfs(next.next, dist+next.value);
            }
        }
    }
    static class Point {
        int next;
        int value;

        public Point(int next, int value) {
            this.next = next;
            this.value = value;
        }

    }
}
